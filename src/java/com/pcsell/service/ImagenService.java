/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.service;

import com.pcsell.entity.Imagen;
import com.pcsell.model.IImagenModel;
import com.pcsell.model.ImagenModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="imagenService")
@ApplicationScoped
public class ImagenService implements IImagenService{

    private final IImagenModel iImagenModel = new ImagenModel();
    
    @Override
    public List<Imagen> obtenerRegistros() {
        return iImagenModel.obtenerRegistros();
    }

    @Override
    public Imagen obtenerRegistro(Long id) {
        return iImagenModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Imagen imagen) {
        iImagenModel.crearRegistro(imagen);
    }

    @Override
    public void actualizarRegistro(Imagen imagen) {
        iImagenModel.actualizarRegistro(imagen);
    }

    @Override
    public void eliminarRegistro(Imagen imagen) {
        iImagenModel.eliminarRegistro(imagen);
    }
    
}
