/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Computadora;
import com.pcsell.service.ComputadoraService;
import com.pcsell.service.IComputadoraService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbookair
 */

public class ComputadoraController extends ActionSupport{
    IComputadoraService iComputadoraService;
    private Computadora computadora;
    private List<Computadora> listaRegistros;
    
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
        try{
            iComputadoraService= new ComputadoraService();
        this.listaRegistros= iComputadoraService.obtenerRegistros();
        return SUCCESS;
        }catch(Exception e){
            System.out.println("Error al obtener Registros. \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String crearRegistro(){
        iComputadoraService = new ComputadoraService() ;
        try {
            iComputadoraService.crearRegistro(computadora);
            this.listaRegistros=(ArrayList<Computadora>) iComputadoraService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String actualizarRegistro(){
        iComputadoraService = new ComputadoraService();
        try {
            iComputadoraService.actualizarRegistro(computadora);
            this.listaRegistros=(ArrayList<Computadora>) iComputadoraService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String eliminarRegistro(){
        iComputadoraService = new ComputadoraService();
        try {
            iComputadoraService.eliminarRegistro(computadora);
            this.listaRegistros=(ArrayList<Computadora>) iComputadoraService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /* GETTERS Y SETTERS*/

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public List<Computadora> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Computadora> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
