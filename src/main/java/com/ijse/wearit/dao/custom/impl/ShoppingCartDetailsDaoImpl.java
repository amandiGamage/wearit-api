package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ShoppingCartDetailsDaoCustom;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Transactional
@Repository
public class ShoppingCartDetailsDaoImpl implements ShoppingCartDetailsDaoCustom {

    private SessionFactory sessionFactory;

    @Autowired
    public ShoppingCartDetailsDaoImpl(EntityManagerFactory factory) {
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ShoppingCartDetails.class);
        c2.add(Restrictions.eq("ITEMDETAILS_ID", id));
        c2.setMaxResults(1);
        ShoppingCartDetails z = (ShoppingCartDetails) c2.uniqueResult();
        return z;
    }

    @Override
    public List<ShoppingCartDetails> getDetailsByCart(ShoppingCart shoppingCart) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ShoppingCartDetails.class);
        c2.add(Restrictions.eq("shoppingCart", shoppingCart));
        List<ShoppingCartDetails> list = c2.list();
        return list;
    }

    @Override
    public boolean updateShoppingCartDetails(ShoppingCartDetails shoppingCartDetails) throws Exception {
        Session s= sessionFactory.openSession();
        s.update(shoppingCartDetails);
        s.close();
        System.out.println("Called");
        return true;
    }
}
