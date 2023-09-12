package com.example.demo.Controller;

import com.example.demo.Models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")// url base de primer nivel
public class IndexController {

    @GetMapping(value = {"/index", "/home", "/", ""})
    //posibles url (segundo nivel ) app+unaDeEstas
    public String index(Model model) {
        model.addAttribute("titulo", "hola con model");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();

        usuario.setNombre("Andy");
        usuario.setApellido("Holguin");
        usuario.setEmail("micorreo@gmail.com");

        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));

        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {


        //CUALQUIERA DE LAS 2 LISTAS FUNCIONA

//        List<Usuario>usuarios = new ArrayList<>();
//        usuarios.add(new Usuario("Andy","Holguin","andy@gmail.com"));
//        usuarios.add(new Usuario("Lady","Lady","lady@gmail.com"));
//        usuarios.add(new Usuario("Nuevo1","Nuevo2",""));

        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Andy", "Holguin", "andy@gmail.com"),
                new Usuario("Lady", "Lady", "lady@gmail.com"),
                new Usuario("Nuevo1", "Nuevo2")
        );


        model.addAttribute("titulo","Listado de usuarios: ");
        model.addAttribute("usuarios",usuarios);
        return "listar";
    }

}
