package com.ijse.wearit.dao;

import com.ijse.wearit.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ShoppingCartDao extends JpaRepository<ShoppingCart,Integer> {
}
