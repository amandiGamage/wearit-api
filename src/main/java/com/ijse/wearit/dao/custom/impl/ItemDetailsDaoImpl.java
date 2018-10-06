package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ItemDetailsDaoCustom;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
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
public class ItemDetailsDaoImpl implements ItemDetailsDaoCustom {

    private SessionFactory sessionFactory;

    @Autowired
    public ItemDetailsDaoImpl(EntityManagerFactory factory) {
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public List<ItemDetails> searchByItemID(Item item) {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ItemDetails.class);
        c2.add(Restrictions.eq("item", item));
        List<ItemDetails> list = c2.list();
        return list;
    }

    @Override
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ItemDetails.class);
        c2.add(Restrictions.eq("sizes", sizeByName));
        c2.add(Restrictions.eq("item", item));
        return (ItemDetails) c2.uniqueResult();
    }

    @Override
    public boolean updateItemDetails(ItemDetails itemDetails) throws Exception {
        Session s= sessionFactory.openSession();
        s.update(itemDetails);
        s.close();
        System.out.println("Called");
        return true;
    }
}
