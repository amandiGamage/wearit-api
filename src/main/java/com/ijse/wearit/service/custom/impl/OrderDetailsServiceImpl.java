package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.OrderDetailsDao;
import com.ijse.wearit.dto.OrderDetailsDTO;
import com.ijse.wearit.service.custom.OrderDetailsService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsDao orderDetailsDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public OrderDetailsDTO add(OrderDetailsDTO orderDetailsDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(OrderDetailsDTO orderDetailsDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(OrderDetailsDTO orderDetailsDTO) throws Exception {
        return false;
    }

    @Override
    public OrderDetailsDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<OrderDetailsDTO> getAll() throws Exception {
        return null;
    }
}
