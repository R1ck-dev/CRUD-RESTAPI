package com.henrique.crud_carros.service.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.crud_carros.dto.CarDTO;
import com.henrique.crud_carros.dto.CarUpdateRequestDTO;
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
    public void deleteCar(Long idForDelete) {
        carRepository.deleteById(idForDelete);
    }

    @Override
    public void updateCarData(CarUpdateRequestDTO dto) {
        Optional<CarModel> optionalCar = carRepository.findById(dto.getId());
        optionalCar.ifPresent(car -> {

            if (dto.getName() != null && !dto.getName().isEmpty()) {
                car.setName(dto.getName());
            }

            if (dto.getColor() != null && !dto.getColor().isEmpty()) {
                car.setColor(dto.getColor());
            }

            if (dto.getPlate() != null && !dto.getPlate().isEmpty()) {
                car.setPlate(dto.getPlate());
            }

            if (dto.getLaunchingYear() != null) {
                car.setLaunchingYear(dto.getLaunchingYear());
            }

            carRepository.save(car);
        });
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
    public String searchCarWithPlate(String plateForSearch) {
        List<CarModel> carsList = carRepository.findAll();
        StringBuilder sb = new StringBuilder();
        for (CarModel car : carsList) {
            if (car.getPlate().equals(plateForSearch)) {
                sb.append(car.toString());
                return sb.toString();
            }
        }
        return "Carro não encontrado";
    }

}
