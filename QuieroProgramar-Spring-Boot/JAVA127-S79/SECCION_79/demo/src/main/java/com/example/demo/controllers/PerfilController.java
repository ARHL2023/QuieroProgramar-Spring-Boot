//package com.example.demo.controllers;
//
//import com.example.demo.models.Usuario;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping("/app")
//
//public class PerfilController {
//
//    @GetMapping({"/index","/home","/","","perfil"})
//    public String perfil(Model model){
//
//        Usuario usuario = new Usuario();
//
//        usuario.setNombre("Andy");
//        usuario.setApellido("Holguin");
//        usuario.setEmail("andy@gmail.com");
//
//        model.addAttribute("perfil",usuario);
//
//        return "perfil";
//    }
//
//}
