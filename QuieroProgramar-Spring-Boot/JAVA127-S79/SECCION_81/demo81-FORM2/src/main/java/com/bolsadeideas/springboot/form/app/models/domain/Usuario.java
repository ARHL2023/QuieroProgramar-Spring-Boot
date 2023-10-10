package com.bolsadeideas.springboot.form.app.models.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Usuario {

//     3 dígitos seguidos de un punto, seguidos de 3 dígitos, seguidos de un punto, seguidos de 3 dígitos,
//    seguidos de un guión y, finalmente, seguidos de una letra mayúscula.
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-[A-Z]")

    private String identificador;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotEmpty (message = "nuestro USUARIO no puede estar vasio (luego se mejorara en el properties)")
    @Size(min = 3, max = 8)
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    @Email
    private String email;

}
