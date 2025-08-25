package com.henrique.crud_carros.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "brand_table")
public class BrandModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "brand")
    private List<CarModel> carsInBrand;
    
    public BrandModel() {}

    public BrandModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarModel> getCarsInBrand() {
        return carsInBrand;
    }

    public void setCarsInBrand(List<CarModel> carsInBrand) {
        this.carsInBrand = carsInBrand;
    }

    
}
