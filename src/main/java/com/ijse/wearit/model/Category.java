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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="Category")
public class Category  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Integer id;
    private String name;
    
    @Transient
    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private Set<Item> items = new HashSet<Item>();

    /**
     * @return the Categoryid
     */
    public Integer getCategoryid() {
        return id;
    }

    /**
     * @param Categoryid the Categoryid to set
     */
    public void setCategoryid(Integer Categoryid) {
        this.id = Categoryid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the items
     */
    public Set<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(Set<Item> items) {
        this.items = items;
    }
    
}
