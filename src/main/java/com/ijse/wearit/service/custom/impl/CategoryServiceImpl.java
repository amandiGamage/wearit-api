package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.CategoryDao;
import com.ijse.wearit.dto.CategoryDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.service.custom.CategoryService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ModelConverter modelConvertor;


    @Override
    public CategoryDTO getCategoryByName(String name) throws Exception {
        return null;
    }

    @Override
    public List<CategoryDTO> getPaginatedList(Integer offset, Integer limit) throws Exception {
        return null;
    }

    @Override
    public CategoryDTO add(CategoryDTO categoryDTO) throws Exception {
        CategoryDTO savedDTO = (CategoryDTO) modelConvertor.convertToDTO(
                categoryDao.save((Category) modelConvertor.convertToModel(
                        categoryDTO,Category.class)),CategoryDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(CategoryDTO categoryDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(CategoryDTO categoryDTO) throws Exception {
        return false;
    }

    @Override
    public CategoryDTO findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Iterable<CategoryDTO> getAll() throws Exception {
        return null;
    }
}
