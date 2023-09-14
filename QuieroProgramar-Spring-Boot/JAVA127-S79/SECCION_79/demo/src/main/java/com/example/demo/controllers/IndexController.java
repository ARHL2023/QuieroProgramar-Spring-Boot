package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app") //ruta base
public class IndexController {

    @GetMapping({"/index", "/home", "/", ""}) //rutas de segundo nivel
    public String index(Model model) {
        model.addAttribute("titulo", "Hola mundo desde spring boot con modelcon thymeleaf");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {

        Usuario usuario = new Usuario();

        usuario.setNombre("Andy");
        usuario.setApellido("Holguin");
        usuario.setEmail("andy@gmail.com");

        model.addAttribute("perfil",usuario);//key y valor
        model.addAttribute("titulo", "Perfil de usuario : ".concat(usuario.getNombre()));

        return "perfil";
    }


    @GetMapping("/listar")
    public String listar(Model model){

        List<Usuario> listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Usuario("Andy","Holguin","andy@gmail.com"));
        listaUsuarios.add(new Usuario("Lady","mite","lady@gmail.com"));
        listaUsuarios.add(new Usuario("Nuevo","Nuevo2"));

        model.addAttribute("titulo", "Lista de usuarios");
        model.addAttribute("usuarios",listaUsuarios);

        return "listar";
    }

}
