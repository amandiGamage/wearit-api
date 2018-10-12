package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.service.custom.SizeService;
import org.springframework.stereotype.Service;

@Service
public class SizeServiceImpl implements SizeService {
    @Override
    public SizeDTO add(SizeDTO sizeDTO) throws Exception {
        return null;
    }

    @Override
    public boolean update(SizeDTO sizeDTO) throws Exception {
        return false;
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
