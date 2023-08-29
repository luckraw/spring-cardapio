package com.luckraw.cardapio.entity;

public record FoodReponseDTO(Long id, String title, String img, Integer price) {

    public FoodReponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImg(), food.getPrice());

    }
}
