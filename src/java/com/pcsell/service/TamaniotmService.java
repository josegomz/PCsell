/*
 *
 */
package com.pcsell.service;

import com.pcsell.entity.Tamaniotm;
import com.pcsell.model.ITamaniotmModel;
import com.pcsell.model.TamaniotmModel;
import java.util.List;

/**
 *
 * @author labtw13
 */
public class TamaniotmService implements ITamaniotmService{
    
    private final ITamaniotmModel iTamaniotmModel = new TamaniotmModel();
    
    @Override
    public List<Tamaniotm> obtenerRegistros() {
        return iTamaniotmModel.obtenerRegistros();
    }

    @Override
    public Tamaniotm obtenerRegistro(Long id) {
        return iTamaniotmModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Tamaniotm tamanio) {
        iTamaniotmModel.crearRegistro(tamanio);
    }

    @Override
    public void actualizarRegistro(Tamaniotm tamanio) {
        iTamaniotmModel.actualizarRegistro(tamanio);
    }

    @Override
    public void eliminarRegistro(Tamaniotm tamanio) {
        iTamaniotmModel.eliminarRegistro(tamanio);
    }
}