package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.service.custom.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Override
    public ShoppingCartDTO add(ShoppingCartDTO shoppingCartDTO) throws Exception {
        return null;
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
