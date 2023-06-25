package com.javapoint.kafka.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String category;
}

