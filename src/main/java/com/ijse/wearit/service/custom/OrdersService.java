package com.ijse.wearit.service.custom;

import com.ijse.wearit.dto.OrdersDTO;
import com.ijse.wearit.service.SuperService;

public interface OrdersService extends SuperService<OrdersDTO>{
    public boolean addOrderss(String userName)throws Exception;
}
