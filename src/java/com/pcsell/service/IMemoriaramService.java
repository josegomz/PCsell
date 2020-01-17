/*
 * interfaz de la entida memoria ram
 */
package com.pcsell.service;

import com.pcsell.entity.Memoriaram;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public interface IMemoriaramService {

    public List<Memoriaram> obtenerRegistros();

    public Memoriaram obtenerRegistro(Long id);

    public void crearRegistro(Memoriaram memoria);

    public void actualizarRegistro(Memoriaram memoria);

    public void eliminarRegistro(Memoriaram memoria);
}
