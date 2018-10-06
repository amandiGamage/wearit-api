package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.UserDaoCustom;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;

@Transactional
@Repository
public class UserDaoImpl implements UserDaoCustom {

    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(EntityManagerFactory factory) {
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public User getUserByUserName(String userName) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(User.class);
        c2.add(Restrictions.eq("userName", userName));
        c2.setMaxResults(1);
        User z = (User) c2.uniqueResult();
        return z;
    }

    @Override
    public ShoppingCart getShoppingCartByUserId(Integer userId) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(User.class);
        c2.add(Restrictions.eq("userID", userId));
        c2.setMaxResults(1);
        User z = (User) c2.uniqueResult();
        return z.getShoppingCart();
    }

    @Override
    public boolean updateUser(User user) throws Exception {
        Session s= sessionFactory.openSession();
        s.update(user);
        s.close();
        System.out.println("Called");
        return true;
    }
}
