package com.ijse.wearit.dao;

import com.ijse.wearit.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface OrdersDao extends JpaRepository<Orders,Integer> {
}
