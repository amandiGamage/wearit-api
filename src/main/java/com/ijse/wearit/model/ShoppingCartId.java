package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Embeddable
public class ShoppingCartId implements Serializable{
    private ItemDetails itemDetails;
    private ShoppingCart shoppingCart; 

    /**
     * @return the itemDetails
     */
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    /**
     * @param itemDetails the itemDetails to set 
     */
    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    /**
     * @return the shoppingCart
     */
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * @param shoppingCart the shoppingCart to set
     */
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
}
