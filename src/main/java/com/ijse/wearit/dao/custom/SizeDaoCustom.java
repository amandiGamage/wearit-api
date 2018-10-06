package com.ijse.wearit.dao.custom;

import com.ijse.wearit.model.Sizes;

public interface SizeDaoCustom {
    public Sizes getSizeByName(String name)throws Exception;
    public boolean updateSize(Sizes sizes)throws Exception;
}
