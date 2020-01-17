/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.MarcaProcesador;
import com.pcsell.model.IMarcaProcesadorModel;
import com.pcsell.model.MarcaProcesadorModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="marcaProcesadorService")
@ApplicationScoped
public class MarcaProcesadorService implements IMarcaProcesadorService{

    private final IMarcaProcesadorModel iMarcaProcesadorModel = new MarcaProcesadorModel();
    
    @Override
    public MarcaProcesador obtenerRegistro(Long id) {
        return iMarcaProcesadorModel.obtenerRegistro(id);
    }

    @Override
    public List<MarcaProcesador> obtenerRegistros() {
        return iMarcaProcesadorModel.obtenerRegistros();
    }

    @Override
    public void crearRegistro(MarcaProcesador marcaprocesador) {
        iMarcaProcesadorModel.crearRegistro(marcaprocesador);
    }

    @Override
    public void actualizarRegistro(MarcaProcesador marcaprocesador) {
        iMarcaProcesadorModel.actualizarRegistro(marcaprocesador);
    }

    @Override
    public void eliminarRegistro(MarcaProcesador marcaprocesador) {
        iMarcaProcesadorModel.eliminarRegistro(marcaprocesador);
    }
    
}
