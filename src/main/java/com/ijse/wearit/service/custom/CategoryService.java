package com.ijse.wearit.service.custom;

import com.ijse.wearit.dto.CategoryDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.service.SuperService;

import java.util.List;

public interface CategoryService extends SuperService<CategoryDTO> {
    public CategoryDTO getCategoryByName(String name)throws Exception;
    public List<CategoryDTO> getPaginatedList(Integer offset, Integer limit)throws Exception;
}
