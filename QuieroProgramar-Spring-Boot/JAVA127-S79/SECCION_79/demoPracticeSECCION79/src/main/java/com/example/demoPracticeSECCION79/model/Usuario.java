package com.example.demoPracticeSECCION79.model;

import lombok.Data;

@Data
public class Usuario {

    private String user;
    private String password;

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Usuario(String user) {
        this.user = user;
    }

}
