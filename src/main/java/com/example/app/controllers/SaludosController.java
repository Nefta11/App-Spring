package com.example.app.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SaludosController {

    public String Bienvenido(){
        return "Bienvenido a Spring";
    }
}
