package com.ijse.wearit.dao.custom;

import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;

import java.util.List;

public interface ItemDetailsDaoCustom {
    public List<ItemDetails> searchByItemID(Item item);
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item)throws Exception;
}
