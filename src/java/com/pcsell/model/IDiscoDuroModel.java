/*
 * Implementación de la intefaz  de la entidad DIsco_duro
 * se crean clases abstractas 
 */
package com.pcsell.model;

import com.pcsell.entity.DiscoDuro;
import java.util.List;

/**
 *
 * @author 706
 */
public interface IDiscoDuroModel {

    public List<DiscoDuro> obtenerRegistros();

    public DiscoDuro obtenerRegistro(Long id);

    public void crearRegistro(DiscoDuro disco);

    public void actualizarRegistro(DiscoDuro disco);

    public void eliminarRegistro(DiscoDuro disco);
}
