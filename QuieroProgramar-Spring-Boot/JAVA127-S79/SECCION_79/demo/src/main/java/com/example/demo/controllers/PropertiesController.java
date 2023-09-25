package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prop")
public class PropertiesController {


    @Value("${texto.properties}")
    private String textoProperties;

    @GetMapping({"/",""})
    public String properties(Model model){
        model.addAttribute("texto",textoProperties);
        return "/properties/properties";
    }

}
