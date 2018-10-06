package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Embeddable
public class ShoppingCartDetailCompositeId  implements Serializable{
    private ShoppingCart shoppingCart;
    private ItemDetails itemDetals;
    
    public ShoppingCartDetailCompositeId(){
        
    }

    /**
     * @return the shoppingCart
     */
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * @param shoppingCart the size to set
     */
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * @return the itemDetails
     */
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public ItemDetails getItemDetails() {
        return itemDetals;
    }

    /**
     * @param itemDetails the item to set
     */
    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetals = itemDetails;
    }
}
