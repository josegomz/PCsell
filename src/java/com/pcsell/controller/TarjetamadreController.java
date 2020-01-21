/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Tarjetamadre;
import com.pcsell.service.ITarjetamadreService;
import com.pcsell.service.TarjetamadreService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class TarjetamadreController extends ActionSupport{
    ITarjetamadreService iTarjetamadreService;
    private Tarjetamadre tarjetamadre;
    private List<Tarjetamadre> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        iTarjetamadreService = new TarjetamadreService();
        try{
            this.listaRegistros =iTarjetamadreService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String crearRegistro(){
        iTarjetamadreService = new TarjetamadreService();
        try{
            iTarjetamadreService.crearRegistro(tarjetamadre);
            this.listaRegistros =iTarjetamadreService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String actualizarRegistro(){
        iTarjetamadreService = new TarjetamadreService();
        try{
            iTarjetamadreService.actualizarRegistro(tarjetamadre);
            this.listaRegistros =iTarjetamadreService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String eliminarRegistro(){
        iTarjetamadreService = new TarjetamadreService();
        try{
            iTarjetamadreService.eliminarRegistro(tarjetamadre);
            this.listaRegistros =iTarjetamadreService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Tarjetamadre getTarjetamadre() {
        return tarjetamadre;
    }

    public void setTarjetamadre(Tarjetamadre tarjetamadre) {
        this.tarjetamadre = tarjetamadre;
    }

    public List<Tarjetamadre> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Tarjetamadre> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
