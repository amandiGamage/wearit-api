package com.ijse.wearit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "Item")
public class Item implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String description;
    private String paths;
    
    @Transient
    @OneToMany(mappedBy = "item",fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)      
    Set<ItemDetails> itemDetails=new HashSet<ItemDetails>();
    
    public Item(){
        
    }
    
    @ManyToOne(optional = true,fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinColumn(name="Category_id",nullable=false)
    private Category category;

    public void setItemDetails(Set<ItemDetails> itemDetails){
        this.itemDetails=itemDetails;
    }
    
    public Set<ItemDetails> getItemDetails(){
        return this.itemDetails;
    }
    /**
     * @return the itemCode
     */
    public Integer getItemCode() {
        return id;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(Integer itemCode) {
        this.id = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the path
     */
    public String getPaths() {
        return paths;
    }

    /**
     * @param path the path to set
     */
    public void setPaths(String path) {
        this.paths = path;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    
    
}
