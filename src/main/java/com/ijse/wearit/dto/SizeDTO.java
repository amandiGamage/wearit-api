package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

/**
 *
 * @author Amandi Gamage
 */
@Component
public class SizeDTO extends SuperDTO {
    private String size;
    private String sizeUK;
    private String sizeUS;
    private String sizeEU;
    

    public SizeDTO(String size,String sizeUK, String sizeUS, String sizeEU ) {
        
        this.sizeUK = sizeUK;
        this.sizeUS = sizeUS;
        this.sizeEU = sizeEU;
        this.size = size;
    }

    public SizeDTO() {
        
    }

    public String getSize() {
        return size;
    }

    public String getSizeUK() {
        return sizeUK;
    }

    public void setSizeUK(String sizeUK) {
        this.sizeUK = sizeUK;
    }

    public String getSizeUS() {
        return sizeUS;
    }

    public void setSizeUS(String sizeUS) {
        this.sizeUS = sizeUS;
    }

    public String getSizeEU() {
        return sizeEU;
    }

    public void setSizeEU(String sizeEU) {
        this.sizeEU = sizeEU;
    }


    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
  
}
