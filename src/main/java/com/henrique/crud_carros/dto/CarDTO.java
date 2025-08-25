package com.henrique.crud_carros.dto;

public class CarDTO {
    private String name;
    private String color;
    private int launchingYear;
    private String plate;
    private String brand;
    
    public CarDTO() {}

    public CarDTO(String name, String color, int launchingYear, String plate, String brand) {
        this.name = name;
        this.color = color;
        this.launchingYear = launchingYear;
        this.plate = plate;
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
}
