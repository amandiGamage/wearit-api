package com.ijse.wearit.service.custom;

import com.ijse.wearit.dto.ShoppingCartDTO;
import com.ijse.wearit.dto.ShoppingCartDetailsDTO;
import com.ijse.wearit.service.SuperService;
import java.util.List;


public interface ShoppingCartDetailsService extends SuperService<ShoppingCartDetailsDTO>{
    public ShoppingCartDetailsDTO getByItemDetail(Integer id) throws Exception ;
    public List<ShoppingCartDetailsDTO> getDetailsByCart(ShoppingCartDTO shoppingCartDTO) throws Exception ;
    public boolean addShoppingCartDetailTShopin(String description, String custName, String size, int orderQty, double unitPrice) throws Exception;
}
