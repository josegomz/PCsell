/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Procesador;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IProcesadorModel {

    public List<Procesador> obtenerRegistros();

    public Procesador obtenerRegistro(Long id);

    public void crearRegistro(Procesador procesador);

    public void actualizarRegistro(Procesador procesador);

    public void eliminarRegistro(Procesador procesador);
}
