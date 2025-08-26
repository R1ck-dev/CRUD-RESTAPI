package com.henrique.crud_carros.dto;

public class BrandDTO {
    private String name;

    public BrandDTO() {
    }

    public BrandDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
