package com.example.demo80DI.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("Simple")
//@Primary

public class MiServicio implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando algun proceso simple";
    }

}
