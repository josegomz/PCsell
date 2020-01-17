/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.DisipadorCalor;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface IDisipadorCalorService {

    public List<DisipadorCalor> obtenerRegistros();

    public DisipadorCalor obtenerRegistro(Long id);

    public void crearRegistro(DisipadorCalor disipador);

    public void actualizarRegistro(DisipadorCalor disipador);

    public void eliminarRegistro(DisipadorCalor disipador);

}
