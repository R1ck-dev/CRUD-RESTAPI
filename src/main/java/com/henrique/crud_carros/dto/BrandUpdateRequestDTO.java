package com.henrique.crud_carros.dto;

public class BrandUpdateRequestDTO {
    private Long id;
    private String name;
    
    public BrandUpdateRequestDTO() {
    }

    public BrandUpdateRequestDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
