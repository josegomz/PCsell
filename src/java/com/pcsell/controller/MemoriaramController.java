/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Memoriaram;
import com.pcsell.service.IMemoriaramService;
import com.pcsell.service.MemoriaramService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class MemoriaramController extends ActionSupport{
    
    IMemoriaramService iMemoriaramService;
    private Memoriaram memoriaram;
    private List<Memoriaram> listaRegistros;
    
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
        iMemoriaramService = new MemoriaramService();
        try{
            this.listaRegistros=iMemoriaramService.obtenerRegistros();
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
        iMemoriaramService = new MemoriaramService();
        try{
            iMemoriaramService.crearRegistro(memoriaram);
            this.listaRegistros=iMemoriaramService.obtenerRegistros();
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
        iMemoriaramService = new MemoriaramService();
        try{
            iMemoriaramService.actualizarRegistro(memoriaram);
            this.listaRegistros=iMemoriaramService.obtenerRegistros();
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
        iMemoriaramService = new MemoriaramService();
        try{
            iMemoriaramService.eliminarRegistro(memoriaram);
            this.listaRegistros=iMemoriaramService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public IMemoriaramService getiMemoriaramService() {
        return iMemoriaramService;
    }

    public void setiMemoriaramService(IMemoriaramService iMemoriaramService) {
        this.iMemoriaramService = iMemoriaramService;
    }

    public Memoriaram getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(Memoriaram memoriaram) {
        this.memoriaram = memoriaram;
    }
    
}
