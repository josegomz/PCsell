/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.ProcesadorDisipador;
import com.pcsell.model.IProcesadorDisipadorModel;
import com.pcsell.model.ProcesadorDisipadorModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="procesadorDisipadorService")
@ApplicationScoped
public class ProcesadorDisipadorService implements IProcesadorDisipadorService{

    private final IProcesadorDisipadorModel iProcesadorDisipadorModel = new ProcesadorDisipadorModel();
    
    @Override
    public List<ProcesadorDisipador> obtenerRegistros() {
        return iProcesadorDisipadorModel.obtenerRegistros();
    }

    @Override
    public ProcesadorDisipador obtenerRegistro(Long id) {
        return iProcesadorDisipadorModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(ProcesadorDisipador procesadorDisipador) {
        iProcesadorDisipadorModel.crearRegistro(procesadorDisipador);
    }

    @Override
    public void actualizarRegistro(ProcesadorDisipador procesadorDisipador) {
        iProcesadorDisipadorModel.actualizarRegistro(procesadorDisipador);
    }

    @Override
    public void eliminarRegistro(ProcesadorDisipador procesadorDisipador) {
        iProcesadorDisipadorModel.eliminarRegistro(procesadorDisipador);
    }
    
}
