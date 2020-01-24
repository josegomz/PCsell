/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Memoriaram;
import com.pcsell.model.IMemoriaramModel;
import com.pcsell.model.MemoriaramModel;
import java.util.List;

/**
 *
 * @author labtw13
 */

public class MemoriaramService implements IMemoriaramService{
    
    private final IMemoriaramModel iMemoriaRamModel = new MemoriaramModel();

    @Override
    public List<Memoriaram> obtenerRegistros() {
        return iMemoriaRamModel.obtenerRegistros();
    }

    @Override
    public Memoriaram obtenerRegistro(Long id) {
        return iMemoriaRamModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Memoriaram memoria) {
        iMemoriaRamModel.crearRegistro(memoria);
    }

    @Override
    public void actualizarRegistro(Memoriaram memoria) {
        iMemoriaRamModel.actualizarRegistro(memoria);
    }

    @Override
    public void eliminarRegistro(Memoriaram memoria) {
        iMemoriaRamModel.eliminarRegistro(memoria);
    }
    
}
