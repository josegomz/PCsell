/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Disipadorcalor;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface IDisipadorcalorModel {

    public List<Disipadorcalor> obtenerRegistros();

    public Disipadorcalor obtenerRegistro(Long id);

    public void crearRegistro(Disipadorcalor disipador);

    public void actualizarRegistro(Disipadorcalor disipador);

    public void eliminarRegistro(Disipadorcalor disipador);

}
