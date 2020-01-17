/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Tarjetamadre;
import com.pcsell.model.ITarjetamadreModel;
import com.pcsell.model.TarjetamadreModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labdessw21
 */
@ManagedBean(name="tarjetamadreService")
@ApplicationScoped
public class TarjetamadreService implements ITarjetamadreService{
    
    private final ITarjetamadreModel iTarjetamadreModel = new TarjetamadreModel();

    @Override
    public List<Tarjetamadre> obtenerRegistros() {
        return iTarjetamadreModel.obtenerRegistros();
    }

    @Override
    public Tarjetamadre obtenerRegistro(Long id) {
        return iTarjetamadreModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Tarjetamadre tarjeta) {
        iTarjetamadreModel.crearRegistro(tarjeta);
    }

    @Override
    public void actualizarRegistro(Tarjetamadre tarjeta) {
        iTarjetamadreModel.actualizarRegistro(tarjeta);
    }

    @Override
    public void eliminarRegistro(Tarjetamadre tarjeta) {
        iTarjetamadreModel.eliminarRegistro(tarjeta);
    }
    
}
