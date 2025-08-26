package com.henrique.crud_carros.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henrique.crud_carros.model.BrandModel;

@Repository
public interface BrandRepository extends JpaRepository<BrandModel, Long>{

    Optional<BrandModel> findByName(String name);

}
