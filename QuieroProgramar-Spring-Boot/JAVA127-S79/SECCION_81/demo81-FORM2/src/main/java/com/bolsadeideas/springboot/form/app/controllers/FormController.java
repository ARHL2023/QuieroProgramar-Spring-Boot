package com.bolsadeideas.springboot.form.app.controllers;

import com.bolsadeideas.springboot.form.app.editors.NombreMayusculaEditors;
import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import com.bolsadeideas.springboot.form.app.validations.UsuarioValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;//@Valid
import org.springframework.web.bind.support.SessionStatus;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@SessionAttributes("usuario")// se guarda en una sesion http

public class FormController {

    @Autowired
    private UsuarioValidador validador;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validador);

        //fechas seria lo mismo del @DateTimeFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        //SOLO COMENTE PARA TENER LAS 2 VERSIONES, la seguna aplica el formateo al campo fechaNacimeinto, la priema a todos los date
        //binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
        binder.registerCustomEditor(Date.class, "fechaNacimeinto", new CustomDateEditor(dateFormat, false));

        //format para mayusculas, si quieor hacer con mas solo debo copiar e indicar los otros campos
        binder.registerCustomEditor(String.class, "nombre", new NombreMayusculaEditors());
        binder.registerCustomEditor(String.class, "apellido", new NombreMayusculaEditors());

    }//

    //recuerda que ModelAttribute hace que un metodo lo que retorna se pasa y se guarda en la vista
    @ModelAttribute("paises")
    public List<String> paises(){
        return Arrays.asList("Ecuador","Argentina","Marruecos","Japón");
    }

    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();

        //mostrando valores de atributos de objeto model en el formulario (only nombre y apellido)
        usuario.setNombre("Andy");
        usuario.setApellido("Luna");
        usuario.setIdentificador("12.456.789-K");
        usuario.setEmail("andy@gmail.com");
        usuario.setUsername("1234");
        usuario.setPassword("1234");
        usuario.setCuenta(6);
        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    //El atributo object de thymeleaf en el elemento form
    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus sessionStatus) {

        //pasamos el validador que se inyecta
        //validador.validate(usuario, result);

        model.addAttribute("titulo", "Resultado form");

        if (result.hasErrors()) {
            return "form";
        }

        model.addAttribute("usuario", usuario);
        sessionStatus.setComplete();//elimina el objeto usuario de la sesion
        return "resultado";
    }

}
