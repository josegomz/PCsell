/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.TarjetaMadre;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface ITarjetaMadreModel {
    public List<TarjetaMadre> obtenerRegistros();
    public TarjetaMadre obtenerRegistro();
}
