package com.ijse.wearit.dao;

import com.ijse.wearit.dao.custom.ShoppingCartDetailsDaoCustom;
import com.ijse.wearit.model.ShoppingCartDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ShoppingCartDetailsDao extends JpaRepository<ShoppingCartDetails,Integer>, ShoppingCartDetailsDaoCustom {
}
