package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

/**
 *
 * @author Amandi Gamage
 */
@Component
public class OrderDetailsDTO extends SuperDTO {
    private Integer id;
    private OrdersDTO ordersDTO;
    private int orderQty;
    private String description;
    private int itemDetailsID;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the ordersDTO
     */
    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    /**
     * @param ordersDTO the ordersDTO to set
     */
    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
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
     * @return the itemDetailsID
     */
    public int getItemDetailsID() {
        return itemDetailsID;
    }

    /**
     * @param itemDetailsID the itemDetailsID to set
     */
    public void setItemDetailsID(int itemDetailsID) {
        this.itemDetailsID = itemDetailsID;
    }

}
