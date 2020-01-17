/*
 * Interfaz de la entidad tarjeta madre
 */
package com.pcsell.service;

import com.pcsell.entity.Tarjetamadre;
import java.util.List;

/**
 *
 * @author 706
 */
public interface ITarjetamadreService {

    public List<Tarjetamadre> obtenerRegistros();

    public Tarjetamadre obtenerRegistro(Long id);

    public void crearRegistro(Tarjetamadre tarjeta);

    public void actualizarRegistro(Tarjetamadre tarjeta);

    public void eliminarRegistro(Tarjetamadre tarjeta);
}
