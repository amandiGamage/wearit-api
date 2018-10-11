package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.CategoryDao;
import com.ijse.wearit.dao.ItemDao;
import com.ijse.wearit.dao.ItemDetailsDao;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.service.custom.ItemService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ItemDetailsDao itemDetailsDao;

    @Autowired
    private ModelConverter modelConverter;

    @Autowired
    ServletContext context;

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
        boolean result = false;
        MultipartFile file = itemDTO.getFile();
        String staticPath="resources/images/Item/tempFile/";
        String savedPath=staticPath+itemDTO.getFileName();
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                String path = context.getRealPath("/resources/images/Item") + File.separator +
                        "tempFile";
                File dir = new File(path);
                if (!dir.exists()){
                    dir.mkdirs();
                }
                File destinationFile = new File(dir.getAbsolutePath()+File.separator+itemDTO.getFileName());
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(destinationFile));
                stream.write(bytes);
                stream.close();

                Category category = categoryDao.getCategoryByName(itemDTO.getCategoryName());

                Item item = new Item();
                item.setDescription(itemDTO.getDescription());
                item.setPaths(savedPath);
                item.setCategory(category);
                ItemDTO savedDTO = (ItemDTO) modelConverter.convertToDTO(
                        itemDao.save((Item) modelConverter.convertToModel(itemDTO,Item.class)),ItemDTO.class);
                if (savedDTO != null){
                    result = true;
                }else {
                    result = false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    @Override
    public ItemDTO getItemByDescription(String description) throws Exception {
        ItemDTO itemDTO = (ItemDTO) modelConverter.convertToDTO(itemDao.getItemByDescription(description),ItemDTO.class);
        return itemDTO;
    }

    @Override
    public boolean deleteItemByDescription(String description) throws Exception {
        boolean result = false;

        Item searchedItem = itemDao.getItemByDescription(description);
        result = itemDao.deleteItemByDescription(description);

        if(result){
            List<ItemDetails> itemDetailsList = itemDetailsDao.searchByItemID(searchedItem);
            if(itemDetailsList == null){
                System.out.println("Delete operation is success");
                return result;
            }else{
                for(ItemDetails itemDetails : itemDetailsList){
                    itemDetailsDao.delete(itemDetails);
                }
                System.out.println("Delete operation is success");
                return  result;
            }
        }else{
            result = false;
            System.out.println("Delete operation is failed.");
        }
        return  result;
    }

    @Override
    public ItemDTO add(ItemDTO itemDTO) throws Exception {
        ItemDTO savedDTO = (ItemDTO) modelConverter.convertToDTO(
                itemDao.save((Item) modelConverter.convertToModel(itemDTO,Item.class)),ItemDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(ItemDTO itemDTO) throws Exception {
        ItemDTO updatedDTO = (ItemDTO) modelConverter.convertToDTO(
                itemDao.save((Item) modelConverter.convertToModel(itemDTO,Item.class)),ItemDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(ItemDTO itemDTO) throws Exception {
        itemDao.delete((Item) modelConverter.convertToModel(itemDTO,Item.class));
        return true;

    }

    @Override
    public ItemDTO findById(Integer id) throws Exception {
        Optional<Item> byId = itemDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            ItemDTO itemDTO = (ItemDTO) modelConverter.convertToDTO(byId.get(),Item.class);
            return itemDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<ItemDTO> getAll() throws Exception {
        return null;
    }
}
