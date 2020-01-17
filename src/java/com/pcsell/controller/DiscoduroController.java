/*
 * 706
 */
package com.pcsell.controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.pcsell.entity.Discoduro;
import com.pcsell.service.DiscoduroService;
import com.pcsell.service.IDiscoduroService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 706
 */
public class DiscoduroController extends ActionSupport{
    
    IDiscoduroService iDiscoduroService = new DiscoduroService();
    private Discoduro discoduro;
    private List<Discoduro> listaRegistros;
    
    /**
     * funcion que obtiene un registro de la tabla en especifico
     * @return
     * @throws Exception 
     */
    public String obtenerRegistro() throws Exception{
        return SUCCESS;
    }
    
    /**
     * obtiene todos los registros y los gusrda en el arreglo
     * @return 
     */
    public String obtenerRegistros(){
        try{
            iDiscoduroService= new DiscoduroService();
        this.listaRegistros= iDiscoduroService.obtenerRegistros();
        return SUCCESS;
        }catch(Exception e){
            System.out.println("Error al obtener Registros. \n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * crea un registro con los datos del objeto disco duro
     * @return 
     */
    public String crearRegistro(){
        iDiscoduroService = new DiscoduroService();
        try {
            iDiscoduroService.crearRegistro(discoduro);
            this.listaRegistros=(ArrayList<Discoduro>) iDiscoduroService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * con los datos del objeto actualiza la base de datos
     * @return 
     */
    public String actualizarRegistro(){
        iDiscoduroService = new DiscoduroService();
        try {
            iDiscoduroService.actualizarRegistro(discoduro);
            this.listaRegistros=(ArrayList<Discoduro>) iDiscoduroService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /**
     * elimina los registros
     * llamando al service
     * @return 
     */
    public String eliminarRegistro(){
        iDiscoduroService = new DiscoduroService();
        try {
            iDiscoduroService.eliminarRegistro(discoduro);
            this.listaRegistros=(ArrayList<Discoduro>) iDiscoduroService.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("ERROR  --------\n"+e.getMessage());
            return ERROR;
        }
    }
    
    /*GETTERS Y SETTERS*/

    public Discoduro getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(Discoduro discoduro) {
        this.discoduro = discoduro;
    }

    public List<Discoduro> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<Discoduro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
}
