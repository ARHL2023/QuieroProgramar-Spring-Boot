package com.example.demo80DI;

import com.example.demo80DI.models.services.IServicio;
import com.example.demo80DI.models.services.MiServicio;
import com.example.demo80DI.models.services.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("Simple")
    @Primary
    public IServicio registratMiServicio(){
        return  new MiServicio();
    }

    @Bean("Importante")
   // @Primary
    public IServicio registratMiServicioComplejo(){
        return  new MiServicioComplejo();
    }

}
