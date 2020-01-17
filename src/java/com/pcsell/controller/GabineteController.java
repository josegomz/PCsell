/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Gabinete;
import com.pcsell.service.GabineteService;
import com.pcsell.service.IGabineteService;
import java.util.List;

/**
 *
 * @author 706
 */
public class GabineteController extends ActionSupport{
    
    IGabineteService iGabineteService;
    private Gabinete gabinete;
    private List<Gabinete> listaRegistros;
    
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
        iGabineteService = new GabineteService();
        try{
            this.listaRegistros = iGabineteService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String crearRegistro(){
        iGabineteService = new GabineteService();
        try{
            iGabineteService.crearRegistro(gabinete);
            this.listaRegistros = iGabineteService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String actualizarRegistro(){
        iGabineteService = new GabineteService();
        try{
            iGabineteService.actualizarRegistro(gabinete);
            this.listaRegistros = iGabineteService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String eliminarRegistro(){
        iGabineteService = new GabineteService();
        try{
            iGabineteService.eliminarRegistro(gabinete);
            this.listaRegistros = iGabineteService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public List<Gabinete> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Gabinete> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
