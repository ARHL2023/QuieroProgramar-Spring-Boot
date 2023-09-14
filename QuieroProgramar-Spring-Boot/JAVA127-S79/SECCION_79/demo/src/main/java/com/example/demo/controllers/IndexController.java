package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app") //ruta base
public class IndexController {

    @GetMapping({"/index","/home","/",""}) //rutas de segundo nivel
    public String index(Model model){
        model.addAttribute("titulo","Hola mundo desde spring boot con modelcon thymeleaf");
        return "index";
    }

}
