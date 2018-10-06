package com.ijse.wearit.dao.custom;

import com.ijse.wearit.model.Item;

public interface ItemDaoCustom {
    public Item getItemByDescription(String description)throws Exception;
    public boolean deleteItemByDescription(String description)throws Exception;
    public boolean updateItem(Item item)throws Exception;
}
