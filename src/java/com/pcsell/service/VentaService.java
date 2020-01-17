/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Venta;
import com.pcsell.model.IVentaModel;
import com.pcsell.model.VentaModel;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author labtw13
 */
@ManagedBean(name="ventaService")
@ApplicationScoped
public class VentaService implements IVentaService{
    
    private final IVentaModel iVentaModel = new VentaModel();

    @Override
    public List<Venta> obtenerRegistros() {
        return iVentaModel.obtenerRegistros();
    }

    @Override
    public Venta obtenerRegistro(Long id) {
        return iVentaModel.obtenerRegistro(id);
    }

    @Override
    public void crearRegistro(Venta venta) {
        iVentaModel.crearRegistro(venta);
    }

    @Override
    public void actualizarRegistro(Venta venta) {
        iVentaModel.actualizarRegistro(venta);
    }

    @Override
    public void eliminarRegistro(Venta venta) {
        iVentaModel.eliminarRegistro(venta);
    }
}
