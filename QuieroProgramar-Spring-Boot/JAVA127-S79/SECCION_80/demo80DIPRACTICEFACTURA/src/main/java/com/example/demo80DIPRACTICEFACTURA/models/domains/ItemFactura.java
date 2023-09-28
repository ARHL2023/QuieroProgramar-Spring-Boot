package com.example.demo80DIPRACTICEFACTURA.models.domains;

import lombok.Data;

@Data
public class ItemFactura {

    private int cantidad;
    private Producto producto;

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public double calcularImporte(){
        return cantidad * producto.getPrecio();
    }

}
