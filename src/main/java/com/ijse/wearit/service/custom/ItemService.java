package com.ijse.wearit.service.custom;

import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.service.SuperService;

public interface ItemService extends SuperService<ItemDTO>{
    public boolean addItem(ItemDTO itemDTO)throws Exception;
}
