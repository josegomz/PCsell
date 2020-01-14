/*
 *interfaz de la entidad marca procesador
 */
package com.pcsell.model;

import java.util.List;
import com.pcsell.entity.MarcaProcesador;

/**
 *
 * @author 706
 */
public interface IMarcaProcesadorModel {

    public MarcaProcesador obtenerRegistro(Long id);

    public List<MarcaProcesador> obtenerRegistros();

    public void crearRegistro(MarcaProcesador marcaprocesador);

    public void actualizarRegistro(MarcaProcesador marcaprocesador);

    public void eliminarRegistro(MarcaProcesador marcaprocesador);

}
