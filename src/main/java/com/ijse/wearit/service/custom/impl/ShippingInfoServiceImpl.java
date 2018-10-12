package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.ShippingInfoDao;
import com.ijse.wearit.dto.ShippingInfoDTO;
import com.ijse.wearit.model.ShippingInfo;
import com.ijse.wearit.service.custom.ShippingInfoService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingInfoServiceImpl implements ShippingInfoService {

    @Autowired
    private ShippingInfoDao shippingInfoDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public ShippingInfoDTO add(ShippingInfoDTO shippingInfoDTO) throws Exception {
        ShippingInfoDTO savedDTO = (ShippingInfoDTO) modelConverter.convertToDTO(
                shippingInfoDao.save((ShippingInfo) modelConverter.convertToModel(
                        shippingInfoDTO,ShippingInfo.class)),ShippingInfoDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(ShippingInfoDTO shippingInfoDTO) throws Exception {
        ShippingInfoDTO updatedDTO = (ShippingInfoDTO) modelConverter.convertToDTO(
                shippingInfoDao.save((ShippingInfo) modelConverter.convertToModel(
                        shippingInfoDTO,ShippingInfo.class)),ShippingInfoDTO.class);

        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(ShippingInfoDTO shippingInfoDTO) throws Exception {
        shippingInfoDao.delete((ShippingInfo) modelConverter.convertToModel(
                shippingInfoDTO,ShippingInfo.class));
        return true;
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
