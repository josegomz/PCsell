/*
 *interfaz de la entidad marca procesador
 */
package com.pcsell.service;

import java.util.List;
import com.pcsell.entity.Marcaprocesador;

/**
 *
 * @author 706
 */
public interface IMarcaprocesadorService {

    public Marcaprocesador obtenerRegistro(Long id);

    public List<Marcaprocesador> obtenerRegistros();

    public void crearRegistro(Marcaprocesador marcaprocesador);

    public void actualizarRegistro(Marcaprocesador marcaprocesador);

    public void eliminarRegistro(Marcaprocesador marcaprocesador);

}
