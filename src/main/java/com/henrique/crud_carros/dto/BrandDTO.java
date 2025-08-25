package com.henrique.crud_carros.dto;

public class BrandDTO {
    private String brandName;

    public BrandDTO() {
    }

    public BrandDTO(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
}
