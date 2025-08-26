package com.henrique.crud_carros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.crud_carros.dto.BrandDTO;
import com.henrique.crud_carros.model.BrandModel;
import com.henrique.crud_carros.repository.BrandRepository;
import com.henrique.crud_carros.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public BrandModel createBrand(BrandDTO dto) {
        BrandModel brandModel = new BrandModel();

        brandModel.setName(dto.getName());

        return brandRepository.save(brandModel);
    }

    @Override
    public void updateBrandData(Integer idForUpdate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBrandData'");
    }

    @Override
    public void deleteBrand(Integer idForDelete) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBrand'");
    }

    @Override
    public List<BrandModel> listBrands() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listBrands'");
    }

    // @Override
    // public Boolean verifyEmptyBrand() {
    //     List<BrandModel> brandList = brandRepository.findAll();
    //     if (!brandList.isEmpty()) {
    //         return false;
    //     }
    //     return true;
    // }
    
}
