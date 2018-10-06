package com.ijse.wearit.dao;

import com.ijse.wearit.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PaymentMethodDao extends JpaRepository<PaymentMethod,Integer> {
}
