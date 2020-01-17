/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Gabinete;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IGabineteService {

    public List<Gabinete> obtenerRegistros();

    public Gabinete obtenerRegistro(Long id);

    public void crearRegistro(Gabinete gabinete);

    public void actualizarRegistro(Gabinete gabinete);

    public void eliminarRegistro(Gabinete gabinete);
}
