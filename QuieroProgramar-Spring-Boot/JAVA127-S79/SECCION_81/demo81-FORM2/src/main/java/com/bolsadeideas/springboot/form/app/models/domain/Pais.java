package com.bolsadeideas.springboot.form.app.models.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Pais {

    @NotNull
    private Integer id;
    private String codigo;
    private String nombre;

    public Pais() {
    }

    public Pais(Integer id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

}
