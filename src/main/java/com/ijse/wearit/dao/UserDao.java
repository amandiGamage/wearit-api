package com.ijse.wearit.dao;

import com.ijse.wearit.dao.custom.UserDaoCustom;
import com.ijse.wearit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDao extends JpaRepository<User,Integer>, UserDaoCustom {
}
