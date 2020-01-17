/*
 * 
 */
package com.pcsell.service;

import com.pcsell.entity.Disipadorcalor;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface IDisipadorcalorService {

    public List<Disipadorcalor> obtenerRegistros();

    public Disipadorcalor obtenerRegistro(Long id);

    public void crearRegistro(Disipadorcalor disipador);

    public void actualizarRegistro(Disipadorcalor disipador);

    public void eliminarRegistro(Disipadorcalor disipador);

}
