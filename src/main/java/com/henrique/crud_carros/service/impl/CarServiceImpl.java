package com.henrique.crud_carros.service.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.crud_carros.dto.CarDTO;
import com.henrique.crud_carros.model.BrandModel;
import com.henrique.crud_carros.model.CarModel;
import com.henrique.crud_carros.repository.BrandRepository;
import com.henrique.crud_carros.repository.CarRepository;
import com.henrique.crud_carros.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public CarModel createCar(CarDTO dto) {
        CarModel carModel = new CarModel();

        Optional<BrandModel> optionalBrandModel = brandRepository.findByName(dto.getBrand());

        if (optionalBrandModel.isPresent()) {
            BrandModel brandObject = optionalBrandModel.get();
            carModel.setName(dto.getName());
            carModel.setColor(dto.getColor());
            carModel.setLaunchingYear(dto.getLaunchingYear());
            carModel.setPlate(dto.getPlate());
            carModel.setBrand(brandObject);
        } else {
            throw new RuntimeException("Marca Não Encontrada!");
        }

        return carRepository.save(carModel);
    }

    @Override
    public void deleteCar(Integer idForDelete) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCar'");
    }

    @Override
    public void updateCarData(Integer idForUpdate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCarData'");
    }

    @Override
    public String listCars() {
        List<CarModel> carsList = carRepository.findAll();
        StringBuilder sb = new StringBuilder();
        for (CarModel car : carsList) {
            sb.append(car.toString());
            sb.append("<br>");
        }
        return sb.toString();
    }

    @Override
    public CarModel searchCarWithPlate(String plateForSearch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchCarWithPlate'");
    }

}
