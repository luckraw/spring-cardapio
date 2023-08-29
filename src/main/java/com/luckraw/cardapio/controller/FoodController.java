package com.luckraw.cardapio.controller;

import com.luckraw.cardapio.entity.FoodReponseDTO;
import com.luckraw.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodReponseDTO> getAll() {
        List<FoodReponseDTO> foods = repository.findAll().stream().map(FoodReponseDTO::new).toList();
        return foods;
    }

}
