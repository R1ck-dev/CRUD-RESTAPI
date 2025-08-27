package com.henrique.crud_carros.service;

import com.henrique.crud_carros.dto.CarDTO;
import com.henrique.crud_carros.model.CarModel;

public interface CarService {
    
    CarModel createCar(CarDTO dto);

    void deleteCar(Integer idForDelete);

    void updateCarData(Integer idForUpdate);

    String listCars();

    CarModel searchCarWithPlate(String plateForSearch);

}
