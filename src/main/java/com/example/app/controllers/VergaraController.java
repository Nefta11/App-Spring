package com.example.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Vergara")

public class VergaraController {
    @GetMapping("/Yo")
    String Hola(){
        return "Bienvenido a Compras";
    }

    @GetMapping("/Sobre")
    String tu(){
        return "Bienvenido a Sobre nosotros";
    }

}
