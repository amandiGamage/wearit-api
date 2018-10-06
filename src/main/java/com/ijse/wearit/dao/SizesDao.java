package com.ijse.wearit.dao;

import com.ijse.wearit.dao.custom.SizeDaoCustom;
import com.ijse.wearit.model.Sizes;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface SizesDao extends JpaRepository<Sizes,Integer>, SizeDaoCustom {
}
