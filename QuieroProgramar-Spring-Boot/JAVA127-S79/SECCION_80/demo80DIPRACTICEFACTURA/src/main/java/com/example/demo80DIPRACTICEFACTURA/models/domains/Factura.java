package com.example.demo80DIPRACTICEFACTURA.models.domains;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;
import java.util.List;

@Data
@Component
//@RequestScope //indica a Spring que una instancia del bean Factura debe ser creada para cada solicitud HTTP. Esto significa que el bean será creado cuando la solicitud HTTP comience y será destruido cuando la solicitud HTTP finalice.
@SessionScope //marcamos nuestro objeto como de sesion, debe implementar serializable para ser transportado
@ApplicationScope //se guarda en el servelet


public class Factura implements Serializable { //implements para el @SessionScope

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;
    @Autowired
    @Qualifier("itemsFacturaOficna")
    private List<ItemFactura> items;


//    El método @PostConstruct se ejecuta después de que todas las dependencias de un bean de Spring han sido inyectadas.
//    Se puede usar para realizar cualquier inicialización que sea necesaria después de que el bean haya sido creado,
//    como abrir una conexión a una base de datos o cargar datos de configuración.
    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Roman"));
    }


//    El método @PreDestroy se ejecuta justo antes de que un bean de Spring sea destruido.
//    Se puede usar para realizar cualquier limpieza que sea necesaria antes de que el bean sea eliminado,
//    como cerrar una conexión a una base de datos o liberar recursos.
    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida ".concat(descripcion));
    }


}
