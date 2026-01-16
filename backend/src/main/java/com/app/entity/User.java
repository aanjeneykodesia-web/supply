package com.app.entity;
import jakarta.persistence.*;

@Entity
public class User {
 @Id @GeneratedValue
 private Long id;
 private String role;
 private String name;
 private String mobile;
 private double latitude;
 private double longitude;
 private String city;
}