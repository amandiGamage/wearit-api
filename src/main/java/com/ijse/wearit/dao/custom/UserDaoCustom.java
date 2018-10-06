package com.ijse.wearit.dao.custom;

import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.User;

public interface UserDaoCustom {
    public User getUserByUserName(String userName)throws Exception;
    public ShoppingCart getShoppingCartByUserId(Integer userId)throws Exception;
    public boolean updateUser(User user)throws Exception;
}
