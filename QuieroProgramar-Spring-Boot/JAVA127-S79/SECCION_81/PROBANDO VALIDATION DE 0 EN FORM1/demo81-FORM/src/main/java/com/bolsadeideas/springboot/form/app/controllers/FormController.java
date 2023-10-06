package com.bolsadeideas.springboot.form.app.controllers;

import com.bolsadeideas.springboot.form.app.models.domains.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/form")
public class FormController {

    public String form(Model model){
        model.addAttribute("titulo","Crear usuario");
        return "form";
    }

    //MAPEAMOS LOS CAMPOS DEL FORMULARIO AL OBJETO MODEL
    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario , Model model){

        model.addAttribute("titulo","Procesando usuario");
        model.addAttribute("usuario",usuario);

        return "resultado";
    }



}
