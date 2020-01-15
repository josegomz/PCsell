/*
 * Interfaz de la entidad Usuario
 */
package com.pcsell.model;

import com.pcsell.entity.Usuario;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IUsuarioModel {

    public List<Usuario> obtenerRegistros();

    public Usuario obtenerRegistro(Long id);

    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public void eliminarRegistro(Usuario usuario);
}
