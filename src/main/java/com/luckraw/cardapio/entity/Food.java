package com.luckraw.cardapio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String img;
    private Integer price;

}
