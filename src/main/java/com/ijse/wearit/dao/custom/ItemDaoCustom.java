package com.ijse.wearit.dao.custom;

import com.ijse.wearit.model.Item;

public interface ItemDaoCustom {
    public Item getItemByDescription(String description)throws Exception;
}
