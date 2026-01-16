package com.app.entity;
import jakarta.persistence.*;

@Entity
public class Orders {
 @Id @GeneratedValue
 private Long id;
 private Long shopkeeperId;
 private Long manufacturerId;
 private Long transporterId;
 private String status;
 private double totalAmount;
 private String paymentStatus;
}