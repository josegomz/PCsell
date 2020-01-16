/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Computadora;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public class ComputadoraModel implements IComputadoraModel{

    @Override
    public List<Computadora> obtenerRegistros() {
        List<Computadora> lista = null;
        return lista;
    }

    @Override
    public Computadora obtenerRegistro(Long id) {
        Computadora computadora = null;
        return computadora;
    }

    @Override
    public void crearRegistro(Computadora computadora) {
    }

    @Override
    public void actualizarRegistro(Computadora computadora) {
    }

    @Override
    public void eliminarRegistro(Computadora computadora) {
    }
    
}
