/*
 * Implementación de la intefaz  de la entidad DIsco_duro
 * se crean clases abstractas 
 */
package com.pcsell.model;

import com.pcsell.entity.Discoduro;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IDiscoduroModel {

    public List<Discoduro> obtenerRegistros();

    public Discoduro obtenerRegistro(Long id);

    public void crearRegistro(Discoduro disco);

    public void actualizarRegistro(Discoduro disco);

    public void eliminarRegistro(Discoduro disco);
}
