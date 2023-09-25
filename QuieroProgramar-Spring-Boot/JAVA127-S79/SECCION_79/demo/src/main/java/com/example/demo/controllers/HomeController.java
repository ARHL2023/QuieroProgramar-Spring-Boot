package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

    @GetMapping("/")
    public String home(){
        return "redirect:/app/index";// cambia de localhost a la ruta app/index
        //forward - en ves de redirect, cargaria solo localhost 8080  como ruta pero el contenido es de app/index
    }

}
