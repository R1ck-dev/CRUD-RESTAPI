package com.henrique.crud_carros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping(value = "/crud_tela_inicial", produces = "text/html")
    public String mainMenu() {
        return """
                * Criar Carro (criar_carro)<br>
                * Editar Informações de Carro Existente (editar_carro)<br>
                * Listar Todos os Carros (listar_carros)<br>
                * Deletar Carro (deletar_carro)<br>
                * Buscar Carro p/ Placa (buscar_carro)<br>
                * Criar Marca (criar_marca)<br>
                * Editar Informações de Marca Existente (editar_marca)<br>
                * Listar Todas as Marcas (listar_marcas)<br>
                * Deletar Marca (deletar_marca)<br>
                """;
    }
}
