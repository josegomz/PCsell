/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Gabinete;
import com.pcsell.model.GabineteModel;
import com.pcsell.model.IGabineteModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="gabineteService")
@ApplicationScoped
public class GabineteService implements IGabineteService{
    
    private final IGabineteModel iGabineteModel = new GabineteModel();

    @Override
    public List<Gabinete> obtenerRegistros() {
        return iGabineteModel.obtenerRegistros();
    }

    @Override
    public Gabinete obtenerRegistro(Long id) {
        return iGabineteModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Gabinete gabinete) {
        iGabineteModel.crearRegistro(gabinete);
    }

    @Override
    public void actualizarRegistro(Gabinete gabinete) {
        iGabineteModel.actualizarRegistro(gabinete);
    }

    @Override
    public void eliminarRegistro(Gabinete gabinete) {
        iGabineteModel.eliminarRegistro(gabinete);
    }
    
}
