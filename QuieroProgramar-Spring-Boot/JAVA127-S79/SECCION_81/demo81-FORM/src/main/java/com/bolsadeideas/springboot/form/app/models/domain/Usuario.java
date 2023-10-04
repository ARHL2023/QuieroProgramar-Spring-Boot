package com.bolsadeideas.springboot.form.app.models.domain;

import lombok.Data;

@Data
public class Usuario {

    //deben ser igual al name del form

    private String username;
    private String password;
    private String email;

}
