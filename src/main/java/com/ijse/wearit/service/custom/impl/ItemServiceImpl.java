package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ItemDao;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.service.custom.ItemService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
        return false;
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
        return false;
    }

    @Override
    public ItemDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<ItemDTO> getAll() throws Exception {
        return null;
    }
}
