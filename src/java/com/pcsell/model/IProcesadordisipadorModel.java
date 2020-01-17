/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Procesadordisipador;
import java.util.List;

/**
 *
 * @author 
 */
public interface IProcesadordisipadorModel {
    public List<Procesadordisipador> obtenerRegistros();

    public Procesadordisipador obtenerRegistro(Long id);

    public void crearRegistro(Procesadordisipador procesadorDisipador);

    public void actualizarRegistro(Procesadordisipador procesadorDisipador);

    public void eliminarRegistro(Procesadordisipador procesadorDisipador);
}
