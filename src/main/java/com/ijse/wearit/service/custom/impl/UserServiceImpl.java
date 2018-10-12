package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.UserDao;
import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.dto.UserDTO;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.UserService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ModelConverter modelConverter;

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
        UserDTO savedDTO = (UserDTO) modelConverter.convertToDTO(
                userDao.save((User) modelConverter.convertToModel(userDTO,User.class)),UserDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(UserDTO userDTO) throws Exception {
        UserDTO updatedDTO = (UserDTO) modelConverter.convertToDTO(
                userDao.save((User) modelConverter.convertToModel(userDTO,User.class)),UserDTO.class);

        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(UserDTO userDTO) throws Exception {
        userDao.delete((User) modelConverter.convertToModel(userDTO,User.class));
        return true;
    }

    @Override
    public UserDTO findById(Integer id) throws Exception {
        Optional<User> byId = userDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            UserDTO userDTO = (UserDTO) modelConverter.convertToDTO(byId.get(),User.class);
            return userDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<UserDTO> getAll() throws Exception {
        return null;
    }
}
