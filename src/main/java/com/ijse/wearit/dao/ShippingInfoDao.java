package com.ijse.wearit.dao;

import com.ijse.wearit.model.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ShippingInfoDao extends JpaRepository<ShippingInfo,Integer> {
}
