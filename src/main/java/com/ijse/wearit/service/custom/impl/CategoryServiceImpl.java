package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.CategoryDao;
import com.ijse.wearit.dto.CategoryDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.service.custom.CategoryService;
import com.ijse.wearit.util.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ModelConverter modelConverter;


    @Override
    public CategoryDTO getCategoryByName(String name) throws Exception {
        Category categoryByName = categoryDao.getCategoryByName(name);
        if (categoryByName!=null){
            CategoryDTO categoryDTO = (CategoryDTO) modelConverter.convertToDTO(categoryByName,CategoryDTO.class);
            return categoryDTO;
        }else {
            return null;
        }
    }

    @Override
    public List<CategoryDTO> getPaginatedList(Integer offset, Integer limit) throws Exception {
        List<Category> paginatedList = categoryDao.getPaginatedList(offset, limit);
        List<CategoryDTO> dtoList = (List<CategoryDTO>) modelConverter.convertToDTOList(paginatedList,Category.class);
        return dtoList;

    }

    @Override
    public CategoryDTO add(CategoryDTO categoryDTO) throws Exception {
        CategoryDTO savedDTO = (CategoryDTO) modelConverter.convertToDTO(
                categoryDao.save((Category) modelConverter.convertToModel(
                        categoryDTO,Category.class)),CategoryDTO.class);
        return savedDTO;
    }

    @Override
    public boolean update(CategoryDTO categoryDTO) throws Exception {
        CategoryDTO savedDTO = (CategoryDTO) modelConverter.convertToDTO(
                categoryDao.save((Category) modelConverter.convertToModel(
                        categoryDTO,Category.class)),CategoryDTO.class);
        if(savedDTO!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delete(CategoryDTO categoryDTO) throws Exception {
        categoryDao.delete((Category) modelConverter.convertToModel(categoryDTO,Category.class));
        return true;
    }

    @Override
    public CategoryDTO findById(Integer id) throws Exception {
        Optional<Category> byId = categoryDao.findById(id);
        boolean present = byId.isPresent();
        if (present){
            CategoryDTO categoryDTO = (CategoryDTO) modelConverter.convertToDTO(byId.get(),CategoryDTO.class);
            return categoryDTO;
        }else {
            return null;
        }
    }

    @Override
    public Iterable<CategoryDTO> getAll() throws Exception {
        Iterable<CategoryDTO> categoryDTOS = (Iterable<CategoryDTO>)
                modelConverter.convertToDTOList(categoryDao.findAll(),CategoryDTO.class);
        return categoryDTOS;
    }
}
