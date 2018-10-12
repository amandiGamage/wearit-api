package com.ijse.wearit.service.custom;

import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.dto.UserDTO;
import com.ijse.wearit.service.SuperService;


public interface UserService extends SuperService<UserDTO>{
    public  UserDTO getUserByNam(String userName)throws Exception;
    public ShoppingCartDTO getShoppingCartByUserId(Integer userId)throws Exception;
}
