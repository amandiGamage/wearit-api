package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Payment  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Integer id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private PaymentMethod paymentMethod;
    
    private String PaymentResponseMessage;
    private String userIdOrSessionId;

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
     * @return the paymentMethod
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the PaymentResponseMessage
     */
    public String getPaymentResponseMessage() {
        return PaymentResponseMessage;
    }

    /**
     * @param PaymentResponseMessage the PaymentResponseMessage to set
     */
    public void setPaymentResponseMessage(String PaymentResponseMessage) {
        this.PaymentResponseMessage = PaymentResponseMessage;
    }

    /**
     * @return the userIdOrSessionId
     */
    public String getUserIdOrSessionId() {
        return userIdOrSessionId;
    }

    /**
     * @param userIdOrSessionId the userIdOrSessionId to set
     */
    public void setUserIdOrSessionId(String userIdOrSessionId) {
        this.userIdOrSessionId = userIdOrSessionId;
    }

   
    
}
