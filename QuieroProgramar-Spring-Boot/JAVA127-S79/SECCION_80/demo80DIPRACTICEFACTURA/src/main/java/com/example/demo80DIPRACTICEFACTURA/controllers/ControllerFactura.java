package com.example.demo80DIPRACTICEFACTURA.controllers;

import com.example.demo80DIPRACTICEFACTURA.models.domains.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class ControllerFactura {

    @Autowired
    private Factura factura;

    @GetMapping({"","/","ver"})
    public String verFactura(Model model){
        model.addAttribute("titulo","Ejemplo factura con inyeccion de dependencia");
        model.addAttribute("factura",factura);//inyeccion
        return "factura/ver";
    }

}
