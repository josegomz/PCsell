/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Discoduro;
import com.pcsell.model.DiscoduroModel;
import com.pcsell.model.IDiscoduroModel;
import java.util.List;

/**
 *
 * @author labtw13
 */
public class DiscoduroService implements IDiscoduroService{
    
    private final IDiscoduroModel iDiscoDuroModel = new DiscoduroModel();
    
    @Override
    public List<Discoduro> obtenerRegistros() {
        return iDiscoDuroModel.obtenerRegistros();
    }

    @Override
    public Discoduro obtenerRegistro(Long id) {
        return iDiscoDuroModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Discoduro disco) {
        iDiscoDuroModel.crearRegistro(disco);
    }

    @Override
    public void actualizarRegistro(Discoduro disco) {
        iDiscoDuroModel.actualizarRegistro(disco);
    }

    @Override
    public void eliminarRegistro(Discoduro disco) {
        iDiscoDuroModel.eliminarRegistro(disco);
    }
    
}
