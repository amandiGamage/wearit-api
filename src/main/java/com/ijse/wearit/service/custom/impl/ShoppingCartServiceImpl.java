package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ShoppingCartDao;
import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.service.custom.ShoppingCartService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartDao shoppingCartDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public ShoppingCartDTO add(ShoppingCartDTO shoppingCartDTO) throws Exception {
        ShoppingCartDTO savedDTO = (ShoppingCartDTO) modelConverter.convertToDTO(
                shoppingCartDao.save((ShoppingCart) modelConverter.convertToModel(
                        shoppingCartDTO,ShoppingCart.class)),ShoppingCartDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(ShoppingCartDTO shoppingCartDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ShoppingCartDTO shoppingCartDTO) throws Exception {
        return false;
    }

    @Override
    public ShoppingCartDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<ShoppingCartDTO> getAll() throws Exception {
        return null;
    }
}
