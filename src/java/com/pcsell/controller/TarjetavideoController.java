/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Tarjetavideo;
import com.pcsell.service.ITarjetavideoService;
import com.pcsell.service.TarjetavideoService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class TarjetavideoController extends ActionSupport{
    ITarjetavideoService iTarjetavideoService;
    private Tarjetavideo tarjetavideo;
    private List<Tarjetavideo> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        iTarjetavideoService = new TarjetavideoService();
        try{
            this.listaRegistros =iTarjetavideoService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String crearRegistro(){
        iTarjetavideoService = new TarjetavideoService();
        try{
            iTarjetavideoService.crearRegistro(tarjetavideo);
            this.listaRegistros =iTarjetavideoService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String actualizarRegistro(){
        iTarjetavideoService = new TarjetavideoService();
        try{
            iTarjetavideoService.actualizarRegistro(tarjetavideo);
            this.listaRegistros =iTarjetavideoService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String eliminarRegistro(){
        iTarjetavideoService = new TarjetavideoService();
        try{
            iTarjetavideoService.eliminarRegistro(tarjetavideo);
            this.listaRegistros =iTarjetavideoService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Tarjetavideo getTarjetavideo() {
        return tarjetavideo;
    }

    public void setTarjetavideo(Tarjetavideo tarjetavideo) {
        this.tarjetavideo = tarjetavideo;
    }

    public List<Tarjetavideo> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Tarjetavideo> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
