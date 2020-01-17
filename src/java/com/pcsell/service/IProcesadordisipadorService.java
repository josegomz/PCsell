/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Procesadordisipador;
import java.util.List;

/**
 *
 * @author 
 */
public interface IProcesadordisipadorService {
    public List<Procesadordisipador> obtenerRegistros();

    public Procesadordisipador obtenerRegistro(Long id);

    public void crearRegistro(Procesadordisipador procesadorDisipador);

    public void actualizarRegistro(Procesadordisipador procesadorDisipador);

    public void eliminarRegistro(Procesadordisipador procesadorDisipador);
}
