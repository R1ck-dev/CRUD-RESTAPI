package com.henrique.crud_carros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.crud_carros.dto.BrandDTO;
import com.henrique.crud_carros.model.BrandModel;
import com.henrique.crud_carros.service.BrandService;

@RestController
@RequestMapping(value =  "/crud_tela_inicial")
public class BrandController {
    
    @Autowired
    private BrandService brandService;

    @PostMapping(value = "/criar_marca")
    public BrandModel createBrand(@RequestBody BrandDTO dto) {
        BrandModel brand = brandService.createBrand(dto);
        return brand;
    }

    @GetMapping(value = "/listar_marcas")
    public String listBrand() {
        return brandService.listBrands();
    }

    @DeleteMapping(value = "/deletar_marca") 
    public void deleteBrand(@RequestBody Long id) {
        brandService.deleteBrand(id);
    }
}
