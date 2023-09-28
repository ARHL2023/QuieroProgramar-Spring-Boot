package com.example.demo80DI.models.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//puede ser cualquiera de las 2 anotaciones, QUEDA REGISTRADO COMO UN BINS
@Component
//@Service

public class MiServicio implements IServicio {

    public String operacion() {
        return "Ejecutando algun proceso importante, inyeccion de dependencias inyectando por Interface";
    }

}
