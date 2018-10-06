package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ItemDaoCustom;
import com.ijse.wearit.model.Item;
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
public class ItemDaoImpl implements ItemDaoCustom {

    private SessionFactory sessionFactory;

    @Autowired
    public ItemDaoImpl(EntityManagerFactory factory) {
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public Item getItemByDescription(String description) throws Exception {
        Session s= sessionFactory.openSession();
        Criteria c2 =s.createCriteria(Item.class);
        c2.add(Restrictions.eq("description", description));
        c2.setMaxResults(1);
        Item item = (Item) c2.uniqueResult();
        s.close();
        return item;
    }

    @Override
    public boolean deleteItemByDescription(String description) throws Exception {
        Item search = (Item) sessionFactory.getCurrentSession().load(Item.class, description);
        if (search != null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateItem(Item item) throws Exception {
        Session s= sessionFactory.openSession();
        s.update(item);
        s.close();
        System.out.println("Called");
        return true;
    }
}
