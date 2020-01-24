package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Usuario;
import com.pcsell.service.IUsuarioService;
import com.pcsell.service.UsuarioService;
import java.util.ArrayList;

public class LoginActionController extends ActionSupport {

    IUsuarioService service;
    private ArrayList<Usuario> listaRegistros;
    String username, password;

    public String validarUsuario() throws Exception {
        service = new UsuarioService();
        if (service.obtenerUsuarioPorCorreoYcontrasenia(username, password)) {
            listaRegistros = (ArrayList<Usuario>) service.obtenerRegistros();
            return "SUCCESS";
        }
        return "ERROR";
    }

    public ArrayList<Usuario> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(ArrayList<Usuario> listaRegistros) {
        this.listaRegistros = listaRegistros;
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
