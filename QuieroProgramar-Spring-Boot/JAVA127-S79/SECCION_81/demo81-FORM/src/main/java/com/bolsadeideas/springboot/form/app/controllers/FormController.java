//package com.bolsadeideas.springboot.form.app.controllers;
//
//import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//public class FormController {
//
//    @PostMapping("/form")
//    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
//
//        model.addAttribute("titulo", "Resultado form");
//
//        if(result.hasErrors()) {
//            Map<String, String> errores = new HashMap<>();
//            result.getFieldErrors().forEach(err ->{
//                errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
//            });
//            model.addAttribute("error", errores);
//            return "form";
//        }
//
//        model.addAttribute("usuario", usuario);
//
//        return "resultado";
//    }
//
//
//
//    @GetMapping("/form")
//    public String form(Model model) {
//        model.addAttribute("titulo", "Creando usuario");
//
//        //el value del form debe pasarse algun usuarioo, sin esto sale null y tenemeos una excepcion
//        Usuario usuario = new Usuario();
//        model.addAttribute("usuario", usuario);//"usuario" es usado en el value en el input del form
//
//        return "form";
//    }
//
//
//
//
//
////    //MAPEAMOS LOS CAMPOS DEL FORMULARIO AL OBJETO MODEL, VALIDANDO FORMULARIO, ATRIBUTO OBJECT DE THYMELEAF
////    @PostMapping("/form")
////    //BindingResult es un objeto de spring que tiene los mensajes de error, debe ir si o si despues del objeto que se quiere validar
////    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
////
////        model.addAttribute("titulo", "Resultado form");
////
////        if (result.hasErrors()) {
////            Map<String, String> errores = new HashMap<>();
////            result.getFieldErrors().forEach(err -> {
////                errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
////            });
////            model.addAttribute("error", errores);
////            return "form";
////        }
////
////        model.addAttribute("usuario", usuario);
////
////        return "resultado";
////    }//metodo procesar
//
////    @PostMapping("/form")
////    public String procesar(Model model,
////                           @RequestParam String username,
////                           @RequestParam String password,
////                           @RequestParam String email){
////
////        model.addAttribute("titulo","Procesando usuario");
////
////        model.addAttribute("username",username);
////        model.addAttribute("password",password);
////        model.addAttribute("email",email);
////
////        return "resultado";
////    }
//
//
////    @PostMapping("/form")
////    public String procesar(Model model,
////                           @RequestParam String username,
////                           @RequestParam String password,
////                           @RequestParam String email){
////
////        model.addAttribute("titulo","Procesando usuario");
////
////        Usuario usuario = new Usuario();
////        usuario.setUsername(username);
////        usuario.setPassword(password);
////        usuario.setEmail(email);
////
////        model.addAttribute("usuario",usuario);
////
////        return "resultado";
////    }
//
////    //MAPEAMOS LOS CAMPOS DEL FORMULARIO AL OBJETO MODEL
////    @PostMapping("/form")
////    public String procesar( Usuario usuario , Model model){
////
////        model.addAttribute("titulo","Procesando usuario");
////        model.addAttribute("usuario",usuario);
////
////        return "resultado";
////    }
//
//
//}
