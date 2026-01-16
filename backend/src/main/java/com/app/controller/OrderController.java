package com.app.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
 @PostMapping("/place")
 public String placeOrder(){ return "Order Placed"; }
}