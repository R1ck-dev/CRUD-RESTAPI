package com.henrique.crud_carros.service;

import com.henrique.crud_carros.dto.BrandDTO;
import com.henrique.crud_carros.model.BrandModel;

public interface BrandService {
    
    BrandModel createBrand(BrandDTO dto);

    void updateBrandData(Integer idForUpdate);

    void deleteBrand(Integer idForDelete);

    String listBrands();

    // Boolean verifyEmptyBrand();
} 
