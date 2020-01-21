/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Marcaprocesador;
import com.pcsell.service.IMarcaprocesadorService;
import com.pcsell.service.MarcaprocesadorService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class MarcaprocesadorController extends ActionSupport{
    
    IMarcaprocesadorService iMarcaprocesadorService;
    private Marcaprocesador marcaprocesador;
    private List<Marcaprocesador> listaRegistros;
    
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
        iMarcaprocesadorService = new MarcaprocesadorService();
        try{
            this.listaRegistros=iMarcaprocesadorService.obtenerRegistros();
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
        iMarcaprocesadorService = new MarcaprocesadorService();
        try{
            iMarcaprocesadorService.crearRegistro(marcaprocesador);
            this.listaRegistros=iMarcaprocesadorService.obtenerRegistros();
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
        iMarcaprocesadorService = new MarcaprocesadorService();
        try{
            iMarcaprocesadorService.actualizarRegistro(marcaprocesador);
            this.listaRegistros=iMarcaprocesadorService.obtenerRegistros();
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
        iMarcaprocesadorService = new MarcaprocesadorService();
        try{
            iMarcaprocesadorService.eliminarRegistro(marcaprocesador);
            this.listaRegistros=iMarcaprocesadorService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public IMarcaprocesadorService getiMarcaprocesadorService() {
        return iMarcaprocesadorService;
    }

    public void setiMarcaprocesadorService(IMarcaprocesadorService iMarcaprocesadorService) {
        this.iMarcaprocesadorService = iMarcaprocesadorService;
    }

    public Marcaprocesador getMarcaprocesador() {
        return marcaprocesador;
    }

    public void setMarcaprocesador(Marcaprocesador marcaprocesador) {
        this.marcaprocesador = marcaprocesador;
    }
}
