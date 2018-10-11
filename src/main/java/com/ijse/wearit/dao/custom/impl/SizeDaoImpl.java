package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.SizeDaoCustom;
import com.ijse.wearit.model.Sizes;
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
public class SizeDaoImpl implements SizeDaoCustom {

    private SessionFactory sessionFactory;

    @Autowired
    public SizeDaoImpl(EntityManagerFactory factory) {
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public Sizes getSizeByName(String name) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(Sizes.class);
        c2.add(Restrictions.eq("sizes", name));
        c2.setMaxResults(1);
        Sizes z = (Sizes) c2.uniqueResult();
        return z;
    }
}
