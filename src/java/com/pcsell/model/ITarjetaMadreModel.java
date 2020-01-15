/*
 * Interfaz de la entidad tarjeta madre
 */
package com.pcsell.model;

import com.pcsell.entity.TarjetaMadre;
import java.util.List;

/**
 *
 * @author 706
 */
public interface ITarjetaMadreModel {

    public List<TarjetaMadre> obtenerRegistros();

    public TarjetaMadre obtenerRegistro(Long id);

    public void crearRegistr(TarjetaMadre tarjeta);

    public void actualizarRegistro(TarjetaMadre tarjeta);

    public void eliminarRegistro(TarjetaMadre tarjeta);
}
