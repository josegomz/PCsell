/*
 * interfaz de la entida memoria ram
 */
package com.pcsell.model;

import com.pcsell.entity.Memoriaram;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public interface IMemoriaramModel {

    public List<Memoriaram> obtenerRegistros();

    public Memoriaram obtenerRegistro(Long id);

    public void crearRegistro(Memoriaram memoria);

    public void actualizarRegistro(Memoriaram memoria);

    public void eliminarRegistro(Memoriaram memoria);
}
