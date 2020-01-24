/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Venta;
import com.pcsell.model.IVentaModel;
import com.pcsell.model.VentaModel;
import java.util.List;

/**
 *
 * @author labtw13
 */
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
