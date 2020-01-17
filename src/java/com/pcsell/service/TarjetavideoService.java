/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Tarjetavideo;
import com.pcsell.model.ITarjetavideoModel;
import com.pcsell.model.TarjetavideoModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author 706
 */
@ManagedBean(name="tarjetavideoService")
@ApplicationScoped
public class TarjetavideoService implements ITarjetavideoService{
    
    private final ITarjetavideoModel iTarjetavideoModel = new TarjetavideoModel();

    @Override
    public List<Tarjetavideo> obtenerRegistros() {
        return iTarjetavideoModel.obtenerRegistros();
    }

    @Override
    public Tarjetavideo obtenerRegistro(Long id) {
        return iTarjetavideoModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Tarjetavideo tarjeta) {
        iTarjetavideoModel.crearRegistro(tarjeta);
    }

    @Override
    public void actualizarRegistro(Tarjetavideo tarjeta) {
        iTarjetavideoModel.actualizarRegistro(tarjeta);
    }

    @Override
    public void eliminarRegistro(Tarjetavideo tarjeta) {
        iTarjetavideoModel.eliminarRegistro(tarjeta);
    }    
}
