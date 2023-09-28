package com.example.demo80DI.controllers;

import com.example.demo80DI.models.services.IServicio;
import com.example.demo80DI.models.services.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //inyectamos un objeto en el contenedor spring
    @Autowired
    //@Qualifier("Importante")//es el nombre del component
    private IServicio servicio ;

    @GetMapping({"","/","index"})
    public String index(Model model) {
        model.addAttribute("objeto",servicio.operacion());
        return "index";
    }



//    @Autowired//EN EL CONSTRUCTOR PODEMOS OMITIR EL AUTOWHIRED
//    public IndexController(IServicio servicio) {
//        this.servicio = servicio;
//    }

//    @Autowired//
//    public void setServicio(IServicio servicio) {
//        this.servicio = servicio;
//    }

}
