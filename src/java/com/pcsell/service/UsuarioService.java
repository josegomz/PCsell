/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Usuario;
import com.pcsell.model.IUsuarioModel;
import com.pcsell.model.UsuarioModel;
import java.util.List;

/**
 *
 * @author Uriel
 */
public class UsuarioService implements IUsuarioService{
    IUsuarioModel iUsuarioModel = new UsuarioModel();
    

    @Override
    public List<Usuario> obtenerRegistros() {
        return iUsuarioModel.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(Long id) {
        return iUsuarioModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Usuario usuario) {
        iUsuarioModel.crearRegistro(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        iUsuarioModel.actualizarRegistro(usuario);
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        iUsuarioModel.eliminarRegistro(usuario);
    }
    
    public boolean obtenerUsuarioPorCorreoYcontrasenia(String username, String password) {
        return iUsuarioModel.obtenerUsuarioPorCorreoYcontrasenia(username, password);
    }
}
