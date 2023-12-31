package com.example.demo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(required = false) String texto, Model model) {
        // required es por si no pase un parametro pase un null y un error- tambieen podria usar defaultValue="un  valor cualquiera"
        model.addAttribute("resultado", "El texto enviado es " + texto);
        return "params/ver";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam(required = false) String saludo, @RequestParam Integer numero, Model model) {
        // required es por si no pase un parametro pase un null y un error- tambieen podria usar defaultValue="un  valor cualquiera"
        model.addAttribute("resultado", "El saludo enviado es " + saludo + " Y el numero es " + numero);
        return "params/ver";
    }


    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model) {

        String saludo = request.getParameter("saludo");
        Integer numero = null;

        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (NumberFormatException e) {
            numero = 0;
        }

        model.addAttribute("resultado", "El saludo enviado es " + saludo + " Y el numero es " + numero);
        return "params/ver";
    }


}
