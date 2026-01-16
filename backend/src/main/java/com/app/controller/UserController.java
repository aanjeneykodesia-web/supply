package com.app.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
 @PostMapping("/register")
 public String register(){ return "User Registered"; }
}