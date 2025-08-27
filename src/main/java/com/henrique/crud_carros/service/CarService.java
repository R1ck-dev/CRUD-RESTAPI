package com.henrique.crud_carros.service;

import com.henrique.crud_carros.dto.CarDTO;
import com.henrique.crud_carros.dto.CarUpdateRequestDTO;
import com.henrique.crud_carros.model.CarModel;

public interface CarService {
    
    CarModel createCar(CarDTO dto);

    void deleteCar(Long idForDelete);

    void updateCarData(CarUpdateRequestDTO dto);

    String listCars();

    String searchCarWithPlate(String plateForSearch);

}
