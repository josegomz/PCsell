/*
 * Implementacion de la interfaz para la entidad tarjeta_video
 */
package com.pcsell.model;

import com.pcsell.entity.Tarjetavideo;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public interface ITarjetavideoModel {
    public List<Tarjetavideo> obtenerRegistros();

    public Tarjetavideo obtenerRegistro(Long id);

    public void crearRegistro(Tarjetavideo tarjeta);

    public void actualizarRegistro(Tarjetavideo tarjeta);

    public void eliminarRegistro(Tarjetavideo tarjeta);
    
}
