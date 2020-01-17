/*
 * 
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Fuentepoder;
import com.pcsell.service.FuentepoderService;
import com.pcsell.service.IFuentepoderService;
import java.util.List;

/**
 *
 * @author 706
 */
public class FuentepoderController extends ActionSupport{
    
    IFuentepoderService iFuentepoderService;
    private Fuentepoder fuentepoder;
    private List<Fuentepoder> listaRegistros;
    
    /**
     * obtiene un registro en especifico
     * @return
     * @throws Exception 
     */
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    /**
     * se obtienen todos los registros
     * se guardan en el arraylist
     * @return 
     */
    public String obtenerRegistros(){
        iFuentepoderService = new FuentepoderService();
        try{
            this.listaRegistros=iFuentepoderService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * se crea un registro con los datos del objeto Fuentepoder
     * @return 
     */
    public String crearRegistro(){
        iFuentepoderService = new FuentepoderService();
        try{
            iFuentepoderService.crearRegistro(fuentepoder);
            this.listaRegistros=iFuentepoderService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * se modifican los datos de la BD
     * toma el id como referencia
     * @return 
     */
    public String actualizarRegistro(){
        iFuentepoderService = new FuentepoderService();
        try{
            iFuentepoderService.actualizarRegistro(fuentepoder);
            this.listaRegistros=iFuentepoderService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * se elimina el registro en la base de datos
     * @return 
     */
    public String eliminarRegistro(){
        iFuentepoderService = new FuentepoderService();
        try{
            iFuentepoderService.eliminarRegistro(fuentepoder);
            this.listaRegistros=iFuentepoderService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Fuentepoder getFuentepoder() {
        return fuentepoder;
    }

    public void setFuentepoder(Fuentepoder fuentepoder) {
        this.fuentepoder = fuentepoder;
    }

    public List<Fuentepoder> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Fuentepoder> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
