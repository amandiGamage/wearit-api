package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.PaymentMethodDao;
import com.ijse.wearit.dto.PaymentMethodDTO;
import com.ijse.wearit.model.PaymentMethod;
import com.ijse.wearit.service.custom.PaymentMethodService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodDao paymentMethodDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public PaymentMethodDTO add(PaymentMethodDTO paymentMethodDTO) throws Exception {
        PaymentMethodDTO savedDTO = (PaymentMethodDTO)
                modelConverter.convertToDTO(paymentMethodDao.save((PaymentMethod)
                        modelConverter.convertToModel(paymentMethodDTO,PaymentMethod.class)),PaymentMethodDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(PaymentMethodDTO paymentMethodDTO) throws Exception {
        PaymentMethodDTO updatedDTO = (PaymentMethodDTO) modelConverter.convertToDTO(
                paymentMethodDao.save((PaymentMethod) modelConverter.convertToModel(paymentMethodDTO,PaymentMethod.class)),PaymentMethodDTO.class);

        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(PaymentMethodDTO paymentMethodDTO) throws Exception {
        paymentMethodDao.delete((PaymentMethod)
                modelConverter.convertToModel(paymentMethodDTO,PaymentMethod.class));
        return true;
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
