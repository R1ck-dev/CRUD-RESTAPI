package com.henrique.crud_carros.dto;

public class CarUpdateRequestDTO {
    private Long id;
    private String name;
    private String color;
    private Integer launchingYear;
    private String plate;
    
    public CarUpdateRequestDTO() {
    }

    public CarUpdateRequestDTO(String name, String color, int launchingYear, String plate) {
        this.name = name;
        this.color = color;
        this.launchingYear = launchingYear;
        this.plate = plate;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLaunchingYear() {
        return launchingYear;
    }

    public void setLaunchingYear(Integer launchingYear) {
        this.launchingYear = launchingYear;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    
}
