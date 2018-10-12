package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.SizesDao;
import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.custom.SizeService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    private SizesDao sizesDao;

    @Autowired
    private ModelConverter modelConverter;

    @Override
    public SizeDTO add(SizeDTO sizeDTO) throws Exception {
        SizeDTO savedDTO = (SizeDTO) modelConverter.convertToDTO(
                sizesDao.save((Sizes) modelConverter.convertToModel(sizeDTO,Sizes.class)),SizeDTO.class);
        return savedDTO;

    }

    @Override
    public boolean update(SizeDTO sizeDTO) throws Exception {
        SizeDTO updatedDTO = (SizeDTO) modelConverter.convertToDTO(
                sizesDao.save((Sizes) modelConverter.convertToModel(sizeDTO,Sizes.class)),SizeDTO.class);
        if(updatedDTO!=null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean delete(SizeDTO sizeDTO) throws Exception {
        return false;
    }

    @Override
    public SizeDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<SizeDTO> getAll() throws Exception {
        return null;
    }
}
