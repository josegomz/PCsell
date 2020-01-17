/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Procesadordisipador;
import com.pcsell.model.IProcesadordisipadorModel;
import com.pcsell.model.ProcesadordisipadorModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="procesadordisipadorService")
@ApplicationScoped
public class ProcesadordisipadorService implements IProcesadordisipadorService{

    private final IProcesadordisipadorModel iProcesadorDisipadorModel = new ProcesadordisipadorModel();
    
    @Override
    public List<Procesadordisipador> obtenerRegistros() {
        return iProcesadorDisipadorModel.obtenerRegistros();
    }

    @Override
    public Procesadordisipador obtenerRegistro(Long id) {
        return iProcesadorDisipadorModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Procesadordisipador procesadorDisipador) {
        iProcesadorDisipadorModel.crearRegistro(procesadorDisipador);
    }

    @Override
    public void actualizarRegistro(Procesadordisipador procesadorDisipador) {
        iProcesadorDisipadorModel.actualizarRegistro(procesadorDisipador);
    }

    @Override
    public void eliminarRegistro(Procesadordisipador procesadorDisipador) {
        iProcesadorDisipadorModel.eliminarRegistro(procesadorDisipador);
    }
    
}
