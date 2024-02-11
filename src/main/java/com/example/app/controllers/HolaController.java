package com.example.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/")
    String Hola(){
        return "Hola Mundo";
    }
}
