package com.henrique.crud_carros.service;

import java.util.List;

import com.henrique.crud_carros.dto.BrandDTO;
import com.henrique.crud_carros.model.BrandModel;

public interface BrandService {
    
    BrandModel createBrand(BrandDTO dto);

    void updateBrandData(Integer idForUpdate);

    void deleteBrand(Integer idForDelete);

    List<BrandModel> listBrands();
} 
