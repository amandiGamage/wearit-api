package com.ijse.wearit.dao;

import com.ijse.wearit.dao.custom.ItemDaoCustom;
import com.ijse.wearit.model.ItemDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ItemDetailsDao extends JpaRepository<ItemDetails,Integer>, ItemDaoCustom {
}
