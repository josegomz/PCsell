/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.FuentePoder;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IFuentePoderModel {

    public List<FuentePoder> obtenerRegistros();

    public FuentePoder obtenerRegistro(Long id);

    public void crearRegistro(FuentePoder fuente);

    public void actualizarRegistro(FuentePoder fuente);

    public void eliminarRegistro(FuentePoder fuente);
}
