/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Fuentepoder;
import com.pcsell.model.FuentepoderModel;
import com.pcsell.model.IFuentepoderModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="fuentePoderService")
@ApplicationScoped
public class FuentepoderService implements IFuentepoderService{
    
    private final IFuentepoderModel iFuentePoderModel = new FuentepoderModel();

    @Override
    public List<Fuentepoder> obtenerRegistros() {
        return iFuentePoderModel.obtenerRegistros();
    }

    @Override
    public Fuentepoder obtenerRegistro(Long id) {
        return iFuentePoderModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Fuentepoder fuente) {
        iFuentePoderModel.crearRegistro(fuente);
    }

    @Override
    public void actualizarRegistro(Fuentepoder fuente) {
    }

    @Override
    public void eliminarRegistro(Fuentepoder fuente) {
    }
    
}
