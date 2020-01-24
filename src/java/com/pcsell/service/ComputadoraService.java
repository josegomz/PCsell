/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Computadora;
import com.pcsell.model.ComputadoraModel;
import com.pcsell.model.IComputadoraModel;
import java.util.List;

/**
 *
 * @author labtw13
 */

public class ComputadoraService implements IComputadoraService{
    private final IComputadoraModel iComputadoraModel = new ComputadoraModel();

    @Override
    public List<Computadora> obtenerRegistros() {
        return iComputadoraModel.obtenerRegistros();
    }

    @Override
    public Computadora obtenerRegistro(Long id) {
        return iComputadoraModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Computadora computadora) {
        iComputadoraModel.crearRegistro(computadora);
    }

    @Override
    public void actualizarRegistro(Computadora computadora) {
        iComputadoraModel.actualizarRegistro(computadora);
    }

    @Override
    public void eliminarRegistro(Computadora computadora) {
        iComputadoraModel.eliminarRegistro(computadora);
    }
    
}
