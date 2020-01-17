/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Disipadorcalor;
import com.pcsell.service.DisipadorcalorService;
import com.pcsell.service.IDisipadorcalorService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class DisipadorcalorController extends ActionSupport{
    
    IDisipadorcalorService iDisipadorcalorService;
    private Disipadorcalor disipadorcalor;
    private List<Disipadorcalor> listaRegistros;
    
    /**
     * obtiene un dato en especifico y lo guarda en el objedo
     * @return
     * @throws Exception 
     */
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    /**
     * obtiene  todos los registros y los guarda el el arraylist
     * @return 
     */
    public String obtenerRegistros(){
        iDisipadorcalorService = new DisipadorcalorService();
        try{
            this.listaRegistros= iDisipadorcalorService.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error al obtener registros "+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * inserta en la base de datos el registro que esta en el objeto
     * @return 
     */
    public String crearRegistro(){
        iDisipadorcalorService = new DisipadorcalorService();
        try {
            iDisipadorcalorService.crearRegistro(disipadorcalor);
            this.listaRegistros=(ArrayList<Disipadorcalor>) iDisipadorcalorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * modifica en la base de datos el registro que tiene el objeto
     * en base a su id
     * @return 
     */
    public String actualizarRegistro(){
        iDisipadorcalorService = new DisipadorcalorService();
        try {
            iDisipadorcalorService.actualizarRegistro(disipadorcalor);
            this.listaRegistros=(ArrayList<Disipadorcalor>) iDisipadorcalorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * elimina un registro
     * @return 
     */
    public String eliminarRegistro(){
        iDisipadorcalorService = new DisipadorcalorService();
        try {
            iDisipadorcalorService.eliminarRegistro(disipadorcalor);
            this.listaRegistros=(ArrayList<Disipadorcalor>) iDisipadorcalorService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Disipadorcalor getDisipadorcalor() {
        return disipadorcalor;
    }

    public void setDisipadorcalor(Disipadorcalor disipadorcalor) {
        this.disipadorcalor = disipadorcalor;
    }

    public List<Disipadorcalor> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Disipadorcalor> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
}
