package com.ijse.wearit.dto;

/**
 *
 * @author Amandi Gamage
 */
public class PaymentDTO extends SuperDTO {
    private Integer id;
    private PaymentMethodDTO paymentMethodDTO;
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
     * @return the paymentMethodDTO
     */
    public PaymentMethodDTO getPaymentMethodDTO() {
        return paymentMethodDTO;
    }

    /**
     * @param paymentMethodDTO the paymentMethodDTO to set
     */
    public void setPaymentMethodDTO(PaymentMethodDTO paymentMethodDTO) {
        this.paymentMethodDTO = paymentMethodDTO;
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
