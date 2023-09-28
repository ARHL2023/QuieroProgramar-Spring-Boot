package com.example.demo80DIPRACTICEFACTURA.models.domains;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cliente {

    @Value("${cliente.nombre}")
    private String nombre;
    @Value("${cliente.apellido}")
    private String apellido;

//    public Cliente(String nombre, String apellido) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//    }

}
