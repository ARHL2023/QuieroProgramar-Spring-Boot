package com.bolsadeideas.springboot.form.app.models.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Usuario {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String email;

}
