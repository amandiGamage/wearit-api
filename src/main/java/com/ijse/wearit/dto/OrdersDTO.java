package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

import java.util.Set;

/**
 *
 * @author Amandi Gamage
 */
@Component
public class OrdersDTO extends SuperDTO {
    private Integer id;
    private String orderDate;
    private double orderAmount;
    private double discount;
    private PaymentDTO paymentDTO;
    private Set<OrderDetailsDTO> orderDetailsDTO;

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
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the orderAmount
     */
    public double getOrderAmount() {
        return orderAmount;
    }

    /**
     * @param orderAmount the orderAmount to set
     */
    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the paymentDTO
     */
    public PaymentDTO getPaymentDTO() {
        return paymentDTO;
    }

    /**
     * @param paymentDTO the paymentDTO to set
     */
    public void setPaymentDTO(PaymentDTO paymentDTO) {
        this.paymentDTO = paymentDTO;
    }

    /**
     * @return the orderDetailsDTO
     */
    public Set<OrderDetailsDTO> getOrderDetailsDTO() {
        return orderDetailsDTO;
    }

    /**
     * @param orderDetailsDTO the orderDetailsDTO to set
     */
    public void setOrderDetailsDTO(Set<OrderDetailsDTO> orderDetailsDTO) {
        this.orderDetailsDTO = orderDetailsDTO;
    }
    public void addOrderDetailsDTO(OrderDetailsDTO orderDetailsDTO) {
        this.orderDetailsDTO.add(orderDetailsDTO);
    }
}
