package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.PaymentDTO;
import com.ijse.wearit.service.custom.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentDTO add(PaymentDTO paymentDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(PaymentDTO paymentDTO) throws Exception {
        return false;
    }

    @Override
    public PaymentDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<PaymentDTO> getAll() throws Exception {
        return null;
    }
}
