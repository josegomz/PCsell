/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Gabinete;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IGabineteModel {

    public List<Gabinete> obtenerRegistros();

    public Gabinete obtenerRegistro(Long id);

    public void crearRegistro(Gabinete gabinete);

    public void actualizarRegistro(Gabinete gabinete);

    public void eliminarRegistro(Gabinete gabinete);
}
