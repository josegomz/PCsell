/*
 * interfaz de la entida memoria ram
 */
package com.pcsell.model;

import com.pcsell.entity.MemoriaRam;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public interface IMermoriaRamModel {

    public List<MemoriaRam> obtenerRegistros();

    public MemoriaRam obtenerRegistro(Long id);

    public void crearRegistro(MemoriaRam memoria);

    public void actualizarRegistro(MemoriaRam memoria);

    public void eliminarRegistro(MemoriaRam memoria);
}
