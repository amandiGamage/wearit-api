package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.PaymentDao;
import com.ijse.wearit.dto.PaymentDTO;
import com.ijse.wearit.model.Payment;
import com.ijse.wearit.service.custom.PaymentService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public PaymentDTO add(PaymentDTO paymentDTO) throws Exception {
        PaymentDTO savedDTO = (PaymentDTO) modelConverter.convertToDTO(
                paymentDao.save((Payment) modelConverter.convertToModel(paymentDTO,Payment.class)),PaymentDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) throws Exception {
        PaymentDTO updatedDTO = (PaymentDTO) modelConverter.convertToDTO(
                paymentDao.save((Payment) modelConverter.convertToModel(paymentDTO,Payment.class)),PaymentDTO.class);

        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(PaymentDTO paymentDTO) throws Exception {
        paymentDao.delete((Payment)
                modelConverter.convertToModel(paymentDTO,Payment.class));
        return true;
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
