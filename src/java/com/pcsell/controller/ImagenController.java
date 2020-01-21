/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Imagen;
import com.pcsell.service.IImagenService;
import com.pcsell.service.ImagenService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class ImagenController extends ActionSupport{
    
    IImagenService iImagenService;
    private Imagen imagen;
    private List<Imagen> listaRegistros;
    
    /**
     * 
     * @return
     * @throws Exception 
     */
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    /**
     * 
     * @return 
     */
    public String obtenerRegistros(){
        iImagenService = new ImagenService();
        try{
            this.listaRegistros=iImagenService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String crearRegistro(){
        iImagenService = new ImagenService();
        try{
            iImagenService.crearRegistro(imagen);
            this.listaRegistros=iImagenService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String actualizarRegistro(){
        iImagenService = new ImagenService();
        try{
            iImagenService.actualizarRegistro(imagen);
            this.listaRegistros=iImagenService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String eliminarRegistro(){
        iImagenService = new ImagenService();
        try{
            iImagenService.eliminarRegistro(imagen);
            this.listaRegistros=iImagenService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public IImagenService getiImagenService() {
        return iImagenService;
    }

    public void setiImagenService(IImagenService iImagenService) {
        this.iImagenService = iImagenService;
    }

    public List<Imagen> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Imagen> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
}
