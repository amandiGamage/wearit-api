package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.ShippingInfoDTO;
import com.ijse.wearit.service.custom.ShippingInfoService;
import org.springframework.stereotype.Service;

@Service
public class ShippingInfoServiceImpl implements ShippingInfoService {
    @Override
    public ShippingInfoDTO add(ShippingInfoDTO shippingInfoDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(ShippingInfoDTO shippingInfoDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ShippingInfoDTO shippingInfoDTO) throws Exception {
        return false;
    }

    @Override
    public ShippingInfoDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<ShippingInfoDTO> getAll() throws Exception {
        return null;
    }
}
