package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ItemDetailsDao;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.dto.ItemDetailsDTO;
import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.model.ItemDetails;
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
    private ModelConverter modelConverter;

    @Override
    public ItemDetailsDTO getItemDetailsBySizeAndItem(SizeDTO sizeByName, ItemDTO itemDTO) throws Exception {
        return null;
    }

    @Override
    public List<ItemDetailsDTO> searchByItemID(ItemDTO itemDTO) throws Exception {
        return null;
    }

    @Override
    public boolean addItemDetailsToItem(String description, List<ItemDetailsDTO> itemdetailsList) throws Exception {
        return false;
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
