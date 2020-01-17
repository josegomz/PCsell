/*
 * Interfaz de la clase Imagen
 */
package com.pcsell.service;

import java.util.List;
import com.pcsell.entity.Imagen;

/**
 *
 * @author 706
 */
public interface IImagenService {

    public List<Imagen> obtenerRegistros();

    public Imagen obtenerRegistro(Long id);

    public void crearRegistro(Imagen imagen);

    public void actualizarRegistro(Imagen imagen);

    public void eliminarRegistro(Imagen imagen);
}
