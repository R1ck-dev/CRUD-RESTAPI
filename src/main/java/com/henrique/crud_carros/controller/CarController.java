package com.henrique.crud_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.crud_carros.dto.CarDTO;
import com.henrique.crud_carros.model.CarModel;
import com.henrique.crud_carros.service.CarService;

@RestController
@RequestMapping(value = "/crud_tela_inicial")
public class CarController {
    
    @Autowired
    private CarService carService;

    @PostMapping(value = "/criar_carro")
    public CarModel createCar(@RequestBody CarDTO dto) {
        CarModel car = carService.createCar(dto);
        return car;
    }

    @GetMapping(value = "/listar_carros", produces = "text/html")
    public String listCars() {
        return carService.listCars();
    }

    @DeleteMapping(value = "/deletar_carro")
    public void deleteCar(@RequestBody Long id) {
        carService.deleteCar(id);
    }

    @PostMapping(value = "/buscar_carro_placa")
    public String findCarByPlate(@RequestBody String plate) {
        return carService.searchCarWithPlate(plate);
    }
}
