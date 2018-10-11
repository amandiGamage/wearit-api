package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.OrderDetailsDao;
import com.ijse.wearit.dto.OrderDetailsDTO;
import com.ijse.wearit.model.OrderDetails;
import com.ijse.wearit.service.custom.OrderDetailsService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsDao orderDetailsDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public OrderDetailsDTO add(OrderDetailsDTO orderDetailsDTO) throws Exception {
        OrderDetailsDTO savedDTO = (OrderDetailsDTO)
                modelConverter.convertToDTO(orderDetailsDao.save((OrderDetails)
                        modelConverter.convertToModel(orderDetailsDTO,OrderDetails.class)),OrderDetailsDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(OrderDetailsDTO orderDetailsDTO) throws Exception {
        OrderDetailsDTO updatedDTO = (OrderDetailsDTO)
                modelConverter.convertToDTO(orderDetailsDao.save((OrderDetails)
                        modelConverter.convertToModel(orderDetailsDTO,OrderDetails.class)),OrderDetailsDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(OrderDetailsDTO orderDetailsDTO) throws Exception {
        orderDetailsDao.delete((OrderDetails) modelConverter.convertToModel(orderDetailsDTO,OrderDetails.class));
        return true;
    }

    @Override
    public OrderDetailsDTO findById(Integer id) throws Exception {
        Optional<OrderDetails> byId = orderDetailsDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            OrderDetailsDTO orderDetailsDTO = (OrderDetailsDTO)
                    modelConverter.convertToDTO(byId.get(),OrderDetails.class);
            return orderDetailsDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<OrderDetailsDTO> getAll() throws Exception {
        return null;
    }
}
