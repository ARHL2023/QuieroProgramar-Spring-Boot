package com.bolsadeideas.springboot.form.app.models.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Usuario {


    private String identificador;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String email;

}
