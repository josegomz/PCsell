/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Procesador;
import com.pcsell.service.IProcesadorSevice;
import com.pcsell.service.ProcesadorService;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class ProcesadorController extends ActionSupport{
    
    IProcesadorSevice iProcesadorSevice;
    private Procesador procesador;
    private List<Procesador> listaRegistros;
    
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    public String obtenerRegistros(){
        iProcesadorSevice = new ProcesadorService();
        try {
            this.listaRegistros=iProcesadorSevice.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error \n"+e.getMessage());
            return ERROR;
        }
    }
}
