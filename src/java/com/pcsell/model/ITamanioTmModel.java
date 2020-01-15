/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.model;

import com.pcsell.entity.TamanioTm;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface ITamanioTmModel {

    public List<TamanioTm> obtenerRegistros();

    public TamanioTm obtenerRegistro(Long id);

    public void crearRegistro(TamanioTm tamanio);

    public void actualizarRegistro(TamanioTm tamanio);

    public void eliminarRegistro(TamanioTm tamanio);
}
