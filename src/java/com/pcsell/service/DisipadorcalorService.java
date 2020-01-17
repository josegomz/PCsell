/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Disipadorcalor;
import com.pcsell.model.DisipadorcalorModel;
import com.pcsell.model.IDisipadorcalorModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="disipadorCalorService")
@ApplicationScoped
public class DisipadorcalorService implements IDisipadorcalorService{
    
    private final IDisipadorcalorModel iDisipadorCalorModel = new DisipadorcalorModel();

    @Override
    public List<Disipadorcalor> obtenerRegistros() {
        return iDisipadorCalorModel.obtenerRegistros();
    }

    @Override
    public Disipadorcalor obtenerRegistro(Long id) {
        return iDisipadorCalorModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Disipadorcalor disipador) {
        iDisipadorCalorModel.crearRegistro(disipador);
    }

    @Override
    public void actualizarRegistro(Disipadorcalor disipador) {
        iDisipadorCalorModel.actualizarRegistro(disipador);
    }

    @Override
    public void eliminarRegistro(Disipadorcalor disipador) {
        iDisipadorCalorModel.eliminarRegistro(disipador);
    }
    
}
