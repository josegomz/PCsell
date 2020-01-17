/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Computadora;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public interface IComputadoraService {

    public List<Computadora> obtenerRegistros();

    public Computadora obtenerRegistro(Long id);

    public void crearRegistro(Computadora computadora);

    public void actualizarRegistro(Computadora computadora);

    public void eliminarRegistro(Computadora computadora);
}
