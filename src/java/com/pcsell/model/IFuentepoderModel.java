/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Fuentepoder;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IFuentepoderModel {

    public List<Fuentepoder> obtenerRegistros();

    public Fuentepoder obtenerRegistro(Long id);

    public void crearRegistro(Fuentepoder fuente);

    public void actualizarRegistro(Fuentepoder fuente);

    public void eliminarRegistro(Fuentepoder fuente);
}
