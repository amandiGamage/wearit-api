package com.ijse.wearit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;


@Entity
public class ShoppingCart implements Serializable{
    private Integer id;
    private String addedDate;
    private int numberOfItems;
    private double total;
    
    private Set<ShoppingCartDetails> shoppingCartDetails = new HashSet<ShoppingCartDetails>();

    public ShoppingCart() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CART_ID")
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) { 
        this.addedDate = addedDate;
    }
   
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Transient
    @OneToMany(mappedBy = "shoppingCart",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER,orphanRemoval = true)
    public Set<ShoppingCartDetails> getShoppingCartDetails() {
        return shoppingCartDetails;
    }
 
    public void setShoppingCartDetails(Set<ShoppingCartDetails> shoppingCartDetailses) {
        this.shoppingCartDetails = shoppingCartDetailses;
    }
    
}
