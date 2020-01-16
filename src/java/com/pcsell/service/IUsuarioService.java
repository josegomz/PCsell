/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Usuario;
import java.util.List;

/**
 *
 * @author Uriel
 */
public interface IUsuarioService {
    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(Long id);

    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public void eliminarRegistro(Usuario usuario);
    
}
