package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.service.IUsuarioService;
import com.pcsell.service.UsuarioService;

public class LoginActionController extends ActionSupport {

    IUsuarioService service;
    String username, password;

    public String validarUsuario() throws Exception {
        service = new UsuarioService();
        if (service.obtenerUsuarioPorCorreoYcontrasenia(username, password)) {
            return "SUCCESS";
        }
        return "ERROR";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
