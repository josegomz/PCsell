/*
 * Interfaz de la clase Venta
 */
package com.pcsell.model;

import com.pcsell.entity.Venta;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IVentaModel {
    public List<Venta> obtenerRegistros();

    public Venta obtenerRegistro(Long id);

    public void crearRegistro(Venta venta);

    public void actualizarRegistro(Venta venta);

    public void eliminarRegistro(Venta venta);
    
}
