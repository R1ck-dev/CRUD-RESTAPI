package com.henrique.crud_carros.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_table")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "launching_year")
    private int launchingYear;

    @Column(name = "plate")
    private String plate;

    @ManyToOne
    @JoinColumn(name = "brand")
    @JsonBackReference
    private BrandModel brand;

    public CarModel() {}

    public CarModel(String name, String color, int launchingYear, String plate, BrandModel brand) {
        this.name = name;
        this.color = color;
        this.launchingYear = launchingYear;
        this.plate = plate;
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLaunchingYear() {
        return launchingYear;
    }

    public void setLaunchingYear(int launchingYear) {
        this.launchingYear = launchingYear;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public BrandModel getBrand() {
        return brand;
    }

    public void setBrand(BrandModel brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CarModel [id=" + id + ", name=" + name + ", color=" + color + ", launchingYear=" + launchingYear
                + ", plate=" + plate + ", brand=" + brand + "]";
    }
    
}
