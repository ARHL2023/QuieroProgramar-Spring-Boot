package com.example.demo80DIPRACTICEFACTURA;

import com.example.demo80DIPRACTICEFACTURA.models.domains.ItemFactura;
import com.example.demo80DIPRACTICEFACTURA.models.domains.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){

        Producto producto1 =  new Producto("Camara",100);
        Producto producto2 =  new Producto("Bicicleta",200);

        ItemFactura linea1 = new ItemFactura(1,producto1);
        ItemFactura linea2 = new ItemFactura(5,producto2);

        return Arrays.asList(linea1,linea2);
    }

    //@Primary
    @Bean("itemsFacturaOficna")//anotta con @Qualifier
    public List<ItemFactura> registrarItemsOficuna(){

        Producto producto1 =  new Producto("Monitor",400);
        Producto producto2 =  new Producto("Notebook",200);

        ItemFactura linea1 = new ItemFactura(2,producto1);
        ItemFactura linea2 = new ItemFactura(3,producto2);

        return Arrays.asList(linea1,linea2);
    }

}
