package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
class ItemDetailsId  implements Serializable{
    private Sizes size;
    private Item item;

    /**
     * @return the size
     */
    @ManyToOne(cascade = CascadeType.ALL)
    public Sizes getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Sizes size) {
        this.size = size;
    }

    /**
     * @return the item
     */
    @ManyToOne(cascade = CascadeType.ALL)
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }
}
