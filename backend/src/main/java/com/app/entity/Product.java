package com.app.entity;
import jakarta.persistence.*;

@Entity
public class Product {
 @Id @GeneratedValue
 private Long id;
 private String name;
 private double price;
 private String imageUrl;
 private Long manufacturerId;
}