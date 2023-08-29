package com.luckraw.cardapio.controller;

import com.luckraw.cardapio.entity.Food;
import com.luckraw.cardapio.entity.FoodReponseDTO;
import com.luckraw.cardapio.entity.FoodRequestDTO;
import com.luckraw.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO food) {
        Food newFood = new Food(food);
        repository.save(newFood);
    }

}
