package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.dto.ShoppingCartDetailsDTO;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartDetailsServiceImpl implements ShoppingCartDetailsService {
    @Override
    public ShoppingCartDetailsDTO getByItemDetail(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<ShoppingCartDetailsDTO> getDetailsByCart(ShoppingCartDTO shoppingCartDTO) throws Exception {
        return null;
    }

    @Override
    public boolean addShoppingCartDetailTShopin(String description, String custName, String size, int orderQty, double unitPrice) throws Exception {
        return false;
    }

    @Override
    public ShoppingCartDetailsDTO add(ShoppingCartDetailsDTO shoppingCartDetailsDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(ShoppingCartDetailsDTO shoppingCartDetailsDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ShoppingCartDetailsDTO shoppingCartDetailsDTO) throws Exception {
        return false;
    }

    @Override
    public ShoppingCartDetailsDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<ShoppingCartDetailsDTO> getAll() throws Exception {
        return null;
    }
}
