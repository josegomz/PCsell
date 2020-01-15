/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.DisipadorCalor;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface IDisipadorCalorModel {

    public List<DisipadorCalor> obtenerRegistros();

    public DisipadorCalor obtenerRegistro(Long id);

    public void crearRegistro(DisipadorCalor disipador);

    public void actualizarRegistro(DisipadorCalor disipador);

    public void eliminarRegistro(DisipadorCalor disipador);

}
