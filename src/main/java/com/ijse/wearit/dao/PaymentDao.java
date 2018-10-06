package com.ijse.wearit.dao;

import com.ijse.wearit.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PaymentDao extends JpaRepository<Payment,Integer> {
}
