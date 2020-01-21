/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Procesadordisipador;
import com.pcsell.service.IProcesadordisipadorService;
import com.pcsell.service.ProcesadordisipadorService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class ProcesadordisipadorController extends ActionSupport{
    IProcesadordisipadorService iProcesadordisipadorService;
    private Procesadordisipador procesadordisipador;
    private List<Procesadordisipador> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        iProcesadordisipadorService = new ProcesadordisipadorService();
        try {
            this.listaRegistros=iProcesadordisipadorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String crearRegistro(){
        iProcesadordisipadorService = new ProcesadordisipadorService();
        try {
            iProcesadordisipadorService.crearRegistro(procesadordisipador);
            this.listaRegistros=iProcesadordisipadorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String actualizarRegistro(){
        iProcesadordisipadorService = new ProcesadordisipadorService();
        try {
            iProcesadordisipadorService.actualizarRegistro(procesadordisipador);
            this.listaRegistros=iProcesadordisipadorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    public String eliminarRegistro(){
        iProcesadordisipadorService = new ProcesadordisipadorService();
        try {
            iProcesadordisipadorService.eliminarRegistro(procesadordisipador);
            this.listaRegistros=iProcesadordisipadorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Procesadordisipador getProcesadordisipador() {
        return procesadordisipador;
    }

    public void setProcesadordisipador(Procesadordisipador procesadordisipador) {
        this.procesadordisipador = procesadordisipador;
    }

    public List<Procesadordisipador> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Procesadordisipador> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
