package com.example.demo80DIPRACTICEFACTURA.models.domains;

import lombok.Data;

@Data
public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
