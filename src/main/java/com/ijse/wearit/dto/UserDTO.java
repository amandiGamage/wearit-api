package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

/**
 *
 * @author Amandi Gamage
 */
@Component
public class UserDTO extends SuperDTO {
    private Integer userID;
    private String userName;
    private String password;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private ShoppingCartDTO shoppingCartDTO;
    private ShippingInfoDTO shippinInfoDTO;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public ShoppingCartDTO getShoppingCartDTO() {
        return shoppingCartDTO;
    }

    public void setShoppingCartDTO(ShoppingCartDTO shoppingCartDTO) {
        this.shoppingCartDTO = shoppingCartDTO;
    }

    public ShippingInfoDTO getShippinInfoDTO() {
        return shippinInfoDTO;
    }

    public void setShippinInfoDTO(ShippingInfoDTO shippinInfoDTO) {
        this.shippinInfoDTO = shippinInfoDTO;
    }
    
    
}
