/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Imagen;
import com.pcsell.service.IImagenService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class ImagenController extends ActionSupport{
    
    IImagenService iImagenService;
    private Imagen imagen;
    private List<Imagen> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
}
