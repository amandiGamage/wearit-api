package com.ijse.wearit.dao;

import com.ijse.wearit.dao.custom.CategoryDaoCustom;
import com.ijse.wearit.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryDao extends JpaRepository<Category,Integer>, CategoryDaoCustom {
}
