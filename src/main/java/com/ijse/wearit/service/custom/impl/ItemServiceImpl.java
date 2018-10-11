package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ItemDao;
import com.ijse.wearit.dto.ItemDTO;
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
        return null;
    }

    @Override
    public boolean update(ItemDTO itemDTO) throws Exception {
        return false;
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
