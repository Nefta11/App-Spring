package com.example.app.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hernandez")
public class HernandezController {
    @GetMapping("/Inicio")
    String Hola(){
        return "Bienvenido a inicio";
    }

    @GetMapping("/Busqueda")
    String Busqueda(){
        return "Apartado Busqueda";}

}



