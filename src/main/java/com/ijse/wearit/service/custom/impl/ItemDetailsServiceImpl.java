package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ItemDao;
import com.ijse.wearit.dao.ItemDetailsDao;
import com.ijse.wearit.dao.SizesDao;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.dto.ItemDetailsDTO;
import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.custom.ItemDetailsService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemDetailsServiceImpl implements ItemDetailsService {

    @Autowired
    private ItemDetailsDao itemDetailsDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private SizesDao sizesDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public ItemDetailsDTO getItemDetailsBySizeAndItem(SizeDTO sizeByName, ItemDTO itemDTO) throws Exception {
        ItemDetailsDTO itemDetailsDTO = (ItemDetailsDTO) modelConverter.convertToDTO
                ((ItemDetails) itemDetailsDao.getItemDetailsBySizeAndItem
                        ((Sizes) modelConverter.convertToModel(sizeByName,Sizes.class),
                                (Item) modelConverter.convertToModel(itemDTO,Item.class)),ItemDetailsDTO.class);

        return itemDetailsDTO;

    }

    @Override
    public List<ItemDetailsDTO> searchByItemID(ItemDTO itemDTO) throws Exception {
        List<ItemDetailsDTO> itemDetailsDTOList = (List<ItemDetailsDTO>)
                modelConverter.convertToDTO(itemDetailsDao.searchByItemID(
                        (Item) modelConverter.convertToModel(itemDTO,Item.class)),ItemDetailsDTO.class);

        return itemDetailsDTOList;
    }

    @Override
    public boolean addItemDetailsToItem(String description, List<ItemDetailsDTO> itemdetailsList) throws Exception {
        boolean result = false;
        Item searchedItem = itemDao.getItemByDescription(description);

        for (ItemDetailsDTO itemDetailsDTO : itemdetailsList) {
            Item item = itemDao.getItemByDescription(itemDetailsDTO.getItemDescription());
            Sizes sizes = sizesDao.getSizeByName(itemDetailsDTO.getSizeName());
            ItemDetails itemDetails = new ItemDetails();
            itemDetails.setQtyOnHand(itemDetailsDTO.getQtyOnHand());
            itemDetails.setUnitPrice(itemDetailsDTO.getUnitPrice());
            itemDetails.setItem(item);
            itemDetails.setSizes(sizes);
            ItemDetails saved = itemDetailsDao.save(itemDetails);
            if (saved!=null){
                result = true;
            }else {
                result = false;
            }
        }

        return result;
    }

    @Override
    public ItemDetailsDTO add(ItemDetailsDTO itemDetailsDTO) throws Exception {
        ItemDetailsDTO savedDTO = (ItemDetailsDTO) modelConverter.convertToDTO(
                itemDetailsDao.save((ItemDetails) modelConverter.convertToModel(
                        itemDetailsDTO,ItemDetails.class)),ItemDetailsDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(ItemDetailsDTO itemDetailsDTO) throws Exception {
        ItemDetailsDTO updatedDTO = (ItemDetailsDTO) modelConverter.convertToDTO(
                itemDetailsDao.save((ItemDetails) modelConverter.convertToModel(
                        itemDetailsDTO,ItemDetails.class)),ItemDetailsDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(ItemDetailsDTO itemDetailsDTO) throws Exception {
        itemDetailsDao.delete((ItemDetails) modelConverter.convertToModel(itemDetailsDTO,ItemDetails.class));
        return true;
    }

    @Override
    public ItemDetailsDTO findById(Integer id) throws Exception {
        Optional<ItemDetails> byId = itemDetailsDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            ItemDetailsDTO itemDetailsDTO = (ItemDetailsDTO) modelConverter.convertToDTO(byId.get(),ItemDetails.class);
            return itemDetailsDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<ItemDetailsDTO> getAll() throws Exception {
        return null;
    }
}
