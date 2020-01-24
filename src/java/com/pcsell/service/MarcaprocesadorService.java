/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Marcaprocesador;
import com.pcsell.model.IMarcaprocesadorModel;
import com.pcsell.model.MarcaprocesadorModel;
import java.util.List;

/**
 *
 * @author labtw13
 */
public class MarcaprocesadorService implements IMarcaprocesadorService{

    private final IMarcaprocesadorModel iMarcaProcesadorModel = new MarcaprocesadorModel();
    
    @Override
    public Marcaprocesador obtenerRegistro(Long id) {
        return iMarcaProcesadorModel.obtenerRegistro(id);
    }

    @Override
    public List<Marcaprocesador> obtenerRegistros() {
        return iMarcaProcesadorModel.obtenerRegistros();
    }

    @Override
    public void crearRegistro(Marcaprocesador marcaprocesador) {
        iMarcaProcesadorModel.crearRegistro(marcaprocesador);
    }

    @Override
    public void actualizarRegistro(Marcaprocesador marcaprocesador) {
        iMarcaProcesadorModel.actualizarRegistro(marcaprocesador);
    }

    @Override
    public void eliminarRegistro(Marcaprocesador marcaprocesador) {
        iMarcaProcesadorModel.eliminarRegistro(marcaprocesador);
    }
    
}
