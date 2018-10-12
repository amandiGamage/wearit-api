package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.PaymentMethodDTO;
import com.ijse.wearit.service.custom.PaymentMethodService;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Override
    public PaymentMethodDTO add(PaymentMethodDTO paymentMethodDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(PaymentMethodDTO paymentMethodDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(PaymentMethodDTO paymentMethodDTO) throws Exception {
        return false;
    }

    @Override
    public PaymentMethodDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<PaymentMethodDTO> getAll() throws Exception {
        return null;
    }
}
