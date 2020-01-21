/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Venta;
import com.pcsell.service.IVentaService;
import com.pcsell.service.VentaService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class ventaController extends ActionSupport{
    IVentaService iVentaService;
    private Venta venta;
    private List<Venta> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        iVentaService = new VentaService();
        try{
            this.listaRegistros =iVentaService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String crearRegistro(){
        iVentaService = new VentaService();
        try{
            iVentaService.crearRegistro(venta);
            this.listaRegistros =iVentaService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String actualizarRegistro(){
        iVentaService = new VentaService();
        try{
            iVentaService.actualizarRegistro(venta);
            this.listaRegistros =iVentaService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String eliminarRegistro(){
        iVentaService = new VentaService();
        try{
            iVentaService.eliminarRegistro(venta);
            this.listaRegistros =iVentaService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Venta> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
