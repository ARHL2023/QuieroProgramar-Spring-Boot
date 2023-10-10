package com.bolsadeideas.springboot.form.app.controllers;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;//@Valid
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
@SessionAttributes("usuario")// se guarda en una sesion http
public class FormController {

    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();

        //mostrando valores de atributos de objeto model en el formulario (only nombre y apellido)
        usuario.setNombre("Andy");
        usuario.setApellido("Luna");
        usuario.setIdentificador("123-k");

        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    //El atributo object de thymeleaf en el elemento form
    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus sessionStatus) {

        model.addAttribute("titulo", "Resultado form");

        if (result.hasErrors()) {
            return "form";
        }

        model.addAttribute("usuario", usuario);
        sessionStatus.setComplete();//elimina el objeto usuario de la sesion
        return "resultado";
    }

}
