package com.example.demoPracticeSECCION79.controller;

import com.example.demoPracticeSECCION79.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")

public class ListarController {

    @GetMapping("/listar")
    public String listar(Model model){
        List<Usuario> listarUsuarios = new ArrayList<>();

        listarUsuarios.add(new Usuario("user1","aa"));
        listarUsuarios.add(new Usuario("user2","bb"));
        listarUsuarios.add(new Usuario("user3"));

        model.addAttribute("titulo","Lista de usuarios");
        model.addAttribute("usuarios",listarUsuarios);
        return "listar";
    }

}
