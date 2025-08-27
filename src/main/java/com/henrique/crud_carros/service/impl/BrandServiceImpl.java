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
    public void deleteBrand(Long idForDelete) {
        brandRepository.deleteById(idForDelete);
    }

    @Override
    public String listBrands() {
        List<BrandModel> brandsList = brandRepository.findAll();
        StringBuilder sb = new StringBuilder();
        for (BrandModel brand : brandsList) {
            sb.append(brand.toString());
            sb.append("<br>");
        }
        return sb.toString();
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
