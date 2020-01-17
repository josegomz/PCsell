/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.ProcesadorDisipador;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public class ProcesadorDisipadorModel implements IProcesadorDisipadorModel{

    @Override
    public List<ProcesadorDisipador> obtenerRegistros() {
        List<ProcesadorDisipador> lista = null;
        return lista;
    }

    @Override
    public ProcesadorDisipador obtenerRegistro(Long id) {
        ProcesadorDisipador procesadorDisipador = null;
        return procesadorDisipador;
    }

    @Override
    public void crearRegistro(ProcesadorDisipador procesadorDisipador) {
    }

    @Override
    public void actualizarRegistro(ProcesadorDisipador procesadorDisipador) {
    }

    @Override
    public void eliminarRegistro(ProcesadorDisipador procesadorDisipador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
