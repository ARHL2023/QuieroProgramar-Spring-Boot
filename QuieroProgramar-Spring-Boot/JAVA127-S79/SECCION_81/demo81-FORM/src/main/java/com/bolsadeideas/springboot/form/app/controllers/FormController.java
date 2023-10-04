package com.bolsadeideas.springboot.form.app.controllers;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo","Creando usuario");
        return "form";
    }

//    @PostMapping("/form")
//    public String procesar(Model model,
//                           @RequestParam String username,
//                           @RequestParam String password,
//                           @RequestParam String email){
//
//        model.addAttribute("titulo","Procesando usuario");
//
//        model.addAttribute("username",username);
//        model.addAttribute("password",password);
//        model.addAttribute("email",email);
//
//        return "resultado";
//    }


//    @PostMapping("/form")
//    public String procesar(Model model,
//                           @RequestParam String username,
//                           @RequestParam String password,
//                           @RequestParam String email){
//
//        model.addAttribute("titulo","Procesando usuario");
//
//        Usuario usuario = new Usuario();
//        usuario.setUsername(username);
//        usuario.setPassword(password);
//        usuario.setEmail(email);
//
//        model.addAttribute("usuario",usuario);
//
//        return "resultado";
//    }

    //MAPEAMOS LOS CAMPOS DEL FORMULARIO AL OBJETO MODEL
    @PostMapping("/form")
    public String procesar( Usuario usuario , Model model){

        model.addAttribute("titulo","Procesando usuario");
        model.addAttribute("usuario",usuario);

        return "resultado";
    }

}
