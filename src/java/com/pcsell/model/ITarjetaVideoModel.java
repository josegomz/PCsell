/*
 * Implementacion de la interfaz para la entidad tarjeta_video
 */
package com.pcsell.model;

import com.pcsell.entity.TarjetaVideo;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public interface ITarjetaVideoModel {
    public List<TarjetaVideo> obtenerRegistros();

    public TarjetaVideo obtenerRegistro(Long id);

    public void crearRegistro(TarjetaVideo tarjeta);

    public void actualizarRegistro(TarjetaVideo tarjeta);

    public void eliminarRegistro(TarjetaVideo tarjeta);
    
}
