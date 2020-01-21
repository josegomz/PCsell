/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.service.ITamaniotmService;
import com.pcsell.entity.Tamaniotm;
import com.pcsell.service.TamaniotmService;
import java.util.List;
/**
 *
 * @author macbookair
 */
public class TamaniotmController extends ActionSupport{
    ITamaniotmService iTamaniotmService;
    private Tamaniotm tamaniotm;
    private List<Tamaniotm> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        iTamaniotmService = new TamaniotmService();
        try{
            this.listaRegistros =iTamaniotmService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String crearRegistro(){
        iTamaniotmService = new TamaniotmService();
        try{
            iTamaniotmService.crearRegistro(tamaniotm);
            this.listaRegistros =iTamaniotmService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String actualizarRegistro(){
        iTamaniotmService = new TamaniotmService();
        try{
            iTamaniotmService.actualizarRegistro(tamaniotm);
            this.listaRegistros =iTamaniotmService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String eliminarRegistro(){
        iTamaniotmService = new TamaniotmService();
        try{
            iTamaniotmService.eliminarRegistro(tamaniotm);
            this.listaRegistros =iTamaniotmService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Tamaniotm getTamaniotm() {
        return tamaniotm;
    }

    public void setTamaniotm(Tamaniotm tamaniotm) {
        this.tamaniotm = tamaniotm;
    }

    public List<Tamaniotm> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Tamaniotm> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
