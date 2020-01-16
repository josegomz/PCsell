/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.FuentePoder;
import com.pcsell.entity.ProcesadorDisipador;
import java.util.List;

/**
 *
 * @author 
 */
public interface IProcesadorDisipadorModel {
    public List<ProcesadorDisipador> obtenerRegistros();

    public ProcesadorDisipador obtenerRegistro(Long id);

    public void crearRegistro(ProcesadorDisipador procesadorDisipador);

    public void actualizarRegistro(ProcesadorDisipador procesadorDisipador);

    public void eliminarRegistro(ProcesadorDisipador procesadorDisipador);
}
