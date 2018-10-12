package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ShoppingCartDetailsDao;
import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.dto.ShoppingCartDetailsDTO;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartDetailsServiceImpl implements ShoppingCartDetailsService {

    @Autowired
    private ShoppingCartDetailsDao shoppingCartDetailsDao;

    @Autowired
    private ModelConverter modelConverter;

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
        ShoppingCartDetailsDTO savedDTO = (ShoppingCartDetailsDTO) modelConverter.convertToDTO(
                shoppingCartDetailsDao.save((ShoppingCartDetails) modelConverter.convertToModel(
                        shoppingCartDetailsDTO,ShoppingCartDetails.class)),ShoppingCartDetailsDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(ShoppingCartDetailsDTO shoppingCartDetailsDTO) throws Exception {
        ShoppingCartDetailsDTO updatedDTO = (ShoppingCartDetailsDTO) modelConverter.convertToDTO(
                shoppingCartDetailsDao.save((ShoppingCartDetails) modelConverter.convertToModel(
                        shoppingCartDetailsDTO,ShoppingCartDetails.class)),ShoppingCartDetailsDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(ShoppingCartDetailsDTO shoppingCartDetailsDTO) throws Exception {
        shoppingCartDetailsDao.delete((ShoppingCartDetails) modelConverter.convertToModel(
                shoppingCartDetailsDTO,ShoppingCartDetails.class));
        return true;
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
