package com.ijse.wearit.service.custom;

import com.ijse.wearit.dao.ItemDetailsDao;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.dto.ItemDetailsDTO;
import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.SuperService;
import java.util.List;

public interface ItemDetailsService extends SuperService<ItemDetailsDTO>{
    public ItemDetailsDTO getItemDetailsBySizeAndItem(SizeDTO sizeByName, ItemDTO itemDTO)throws Exception;
    public List<ItemDetailsDTO> searchByItemID(ItemDTO itemDTO)throws Exception;
    public boolean addItemDetailsToItem(String description, List<ItemDetailsDTO> itemdetailsList)throws Exception;
}
