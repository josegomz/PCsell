/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.model;

import com.pcsell.entity.Tamaniotm;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface ITamaniotmModel {

    public List<Tamaniotm> obtenerRegistros();

    public Tamaniotm obtenerRegistro(Long id);

    public void crearRegistro(Tamaniotm tamanio);

    public void actualizarRegistro(Tamaniotm tamanio);

    public void eliminarRegistro(Tamaniotm tamanio);
}
