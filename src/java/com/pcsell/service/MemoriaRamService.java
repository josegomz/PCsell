/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.MemoriaRam;
import com.pcsell.model.IMemoriaRamModel;
import com.pcsell.model.MemoriaRamModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="memoriaRamService")
@ApplicationScoped
public class MemoriaRamService implements IMemoriaRamService{
    
    private final IMemoriaRamModel iMemoriaRamModel = new MemoriaRamModel();

    @Override
    public List<MemoriaRam> obtenerRegistros() {
        return iMemoriaRamModel.obtenerRegistros();
    }

    @Override
    public MemoriaRam obtenerRegistro(Long id) {
        return iMemoriaRamModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(MemoriaRam memoria) {
        iMemoriaRamModel.crearRegistro(memoria);
    }

    @Override
    public void actualizarRegistro(MemoriaRam memoria) {
        iMemoriaRamModel.actualizarRegistro(memoria);
    }

    @Override
    public void eliminarRegistro(MemoriaRam memoria) {
        iMemoriaRamModel.eliminarRegistro(memoria);
    }
    
}
