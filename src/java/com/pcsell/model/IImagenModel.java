/*
 * Interfaz de la clase Imagen
 */
package com.pcsell.model;

import java.util.List;
import com.pcsell.entity.Imagen;

/**
 *
 * @author labtw13
 */
public interface IImagenModel {

    public List<Imagen> obtenerRegistros();

    public Imagen obtenerRegistro(Long id);

    public void crearRegistro(Imagen imagen);

    public void actualizarRegistro(Imagen imagen);

    public void eliminarRegistro(Imagen imagen);
}
