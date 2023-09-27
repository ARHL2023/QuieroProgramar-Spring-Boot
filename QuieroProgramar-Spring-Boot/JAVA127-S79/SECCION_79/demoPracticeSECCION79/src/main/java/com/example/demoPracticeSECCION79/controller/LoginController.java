package com.example.demoPracticeSECCION79.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class LoginController {

    @Value("${loginController.user}")
    private String txtUser;
    @Value("${loginController.pass}")
    private String txtPass;

    @GetMapping({"","/"})
    public String login(Model model) {
        model.addAttribute("tiulo", txtUser+" "+txtPass);
        return "login";
    }

}
