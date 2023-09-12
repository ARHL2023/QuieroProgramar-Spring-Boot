package com.example.demo.Controller;

import com.example.demo.Models.Personas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")

public class PersonasController {

    @GetMapping("/personas")
    public String listaPeronas(Model model){

        List<Personas> p = new ArrayList<>();

        p.add(new Personas("Andy",24));
        p.add(new Personas("Roman",65));
        p.add(new Personas("Lady",18));
        p.add(new Personas("Ami",15));
        p.add(new Personas("La",10));

        model.addAttribute("lista",p);

        return "personas";
    }

}
