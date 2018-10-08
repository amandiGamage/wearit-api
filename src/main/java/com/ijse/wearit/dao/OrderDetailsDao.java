package com.ijse.wearit.dao;

import com.ijse.wearit.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface OrderDetailsDao extends JpaRepository<OrderDetails,Integer> {
}
