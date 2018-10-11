package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.OrdersDao;
import com.ijse.wearit.dto.OrdersDTO;
import com.ijse.wearit.model.Orders;
import com.ijse.wearit.service.custom.OrdersService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public boolean addOrderss(String userName) throws Exception {
        return false;
    }

    @Override
    public OrdersDTO add(OrdersDTO ordersDTO) throws Exception {
        OrdersDTO savedDTO = (OrdersDTO) modelConverter.convertToDTO(
                ordersDao.save((Orders) modelConverter.convertToModel(ordersDTO,Orders.class)),OrdersDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(OrdersDTO ordersDTO) throws Exception {
        OrdersDTO updatedDTO = (OrdersDTO) modelConverter.convertToDTO(
                ordersDao.save((Orders) modelConverter.convertToModel(ordersDTO,Orders.class)),OrdersDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(OrdersDTO ordersDTO) throws Exception {
        ordersDao.delete((Orders) modelConverter.convertToModel(ordersDTO,Orders.class));
        return true;
    }

    @Override
    public OrdersDTO findById(Integer id) throws Exception {
        Optional<Orders> byId = ordersDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            OrdersDTO ordersDTO = (OrdersDTO) modelConverter.convertToDTO(byId.get(),Orders.class);
            return ordersDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<OrdersDTO> getAll() throws Exception {
        return null;
    }
}
