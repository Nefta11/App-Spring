package com.example.app.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Neftali")
public class SaludoController {
    @GetMapping("/welcome")
    String Hola(){
        return "Hola DESDE MI RUTA";
    }

@GetMapping("/servicios")
public String servicios (){
    return "Apartado de servicios";
}

@GetMapping("/productos")
public String productos (){
    return "Apartado de productos";
}

@GetMapping("/contactos")
public String contactos (){
    return "Apartado de contactos";}
}