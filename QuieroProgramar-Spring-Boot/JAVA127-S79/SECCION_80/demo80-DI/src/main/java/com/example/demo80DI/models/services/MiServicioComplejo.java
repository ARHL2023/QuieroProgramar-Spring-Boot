package com.example.demo80DI.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("Importante")
//@Primary

public class MiServicioComplejo implements IServicio {
    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante ";
    }

}
