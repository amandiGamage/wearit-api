package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.dto.UserDTO;
import com.ijse.wearit.service.custom.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO getUserByNam(String userName) throws Exception {
        return null;
    }

    @Override
    public ShoppingCartDTO getShoppingCartByUserId(Integer userId) throws Exception {
        return null;
    }

    @Override
    public UserDTO add(UserDTO userDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(UserDTO userDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(UserDTO userDTO) throws Exception {
        return false;
    }

    @Override
    public UserDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<UserDTO> getAll() throws Exception {
        return null;
    }
}
