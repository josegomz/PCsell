/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Procesador;
import com.pcsell.model.IProcesadorModel;
import com.pcsell.model.ProcesadorModel;
import java.util.List;

/**
 *
 * @author labtw13
 */
public class ProcesadorService implements IProcesadorSevice{

    private final IProcesadorModel iProcesadorModel = new ProcesadorModel();
    
    @Override
    public List<Procesador> obtenerRegistros() {
        return iProcesadorModel.obtenerRegistros();
    }

    @Override
    public Procesador obtenerRegistro(Long id) {
        return iProcesadorModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Procesador procesador) {
        iProcesadorModel.crearRegistro(procesador);
    }

    @Override
    public void actualizarRegistro(Procesador procesador) {
        iProcesadorModel.actualizarRegistro(procesador);
    }

    @Override
    public void eliminarRegistro(Procesador procesador) {
        iProcesadorModel.eliminarRegistro(procesador);
    }
    
}
