package com.henrique.crud_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henrique.crud_carros.model.CarModel;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long>{

} 
