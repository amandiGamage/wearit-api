package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

/**
 *
 * @author Amandi Gamage
 */
@Component
public class ItemDetailsDTO extends SuperDTO{

    private Integer _id;
    private String _sizeName;
    private String _itemDescription;
    private double _unitPrice;
    private int _qtyOnHand;

    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public String getSizeName() {
        return _sizeName;
    }

    public void setSizeName(String sizeName) {
        this._sizeName = sizeName;
    }

    public String getItemDescription() {
        return _itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this._itemDescription = itemDescription;
    }

    public double getUnitPrice() {
        return _unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this._unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return _qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this._qtyOnHand = qtyOnHand;
    }  
}
