package com.ijse.wearit.dao;

import com.ijse.wearit.dao.custom.ItemDaoCustom;
import com.ijse.wearit.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ItemDao extends JpaRepository<Item,Integer>, ItemDaoCustom {
}
