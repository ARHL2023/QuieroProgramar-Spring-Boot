package com.bolsadeideas.springboot.form.app.models.domain;


import lombok.Data;

@Data
public class Usuario {

    @No
    private String username;
    private String password;
    private String email;


}
