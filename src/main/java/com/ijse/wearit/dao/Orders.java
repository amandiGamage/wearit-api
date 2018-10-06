package com.ijse.wearit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface Orders extends JpaRepository<Orders,Integer> {
}
