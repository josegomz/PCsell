/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.model;

import com.pcsell.entity.MemoriaRam;
import java.util.List;

/**
 *
 * @author labdessw21
 */
public class MemoriaRamModel implements IMermoriaRamModel{

    @Override
    public List<MemoriaRam> obtenerRegistros() {
        List<MemoriaRam> lista = null;
        return lista;
    }

    @Override
    public MemoriaRam obtenerRegistro(Long id) {
        MemoriaRam memoria= null;
        return memoria;
    }

    @Override
    public void crearRegistro(MemoriaRam memoria) {
    }

    @Override
    public void actualizarRegistro(MemoriaRam memoria) {
    }

    @Override
    public void eliminarRegistro(MemoriaRam memoria) {
    }
    
}
