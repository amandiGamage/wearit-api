package com.ijse.wearit.dao.custom;

import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;

import java.util.List;

public interface ShoppingCartDetailsDaoCustom {
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception ;
    public List<ShoppingCartDetails> getDetailsByCart(ShoppingCart shoppingCart) throws Exception ;
    public boolean updateShoppingCartDetails(ShoppingCartDetails shoppingCartDetails)throws Exception;
}
