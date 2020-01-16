/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.controller;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.pcsell.entity.Usuario;
import com.pcsell.service.IUsuarioService;
import com.pcsell.service.UsuarioService;
import java.util.ArrayList;

/**
 *
 * @author Uriel
 */
public class UsuarioController {
    IUsuarioService service;
    private Usuario usuario;
    private ArrayList<Usuario> listaRegistros;

    public ArrayList<Usuario> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(ArrayList<Usuario> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    public String crearRegistro()throws Exception{
        try {
            service = new UsuarioService();
            service.crearRegistro(usuario);
            listaRegistros = (ArrayList<Usuario>) service.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
            return ERROR;
        }
    }
    
    public String obtenerRegistros() throws Exception{
         try {
            service = new UsuarioService();
            listaRegistros = (ArrayList<Usuario>) service.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
            return ERROR;
        }
    }
    
    public String eliminarRegistro() throws Exception{
        try {
            service = new UsuarioService();
            service.eliminarRegistro(usuario);
            listaRegistros = (ArrayList<Usuario>) service.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
            return ERROR;
        }
    }
    
    public String actualizarRegistro() throws Exception{
        try {
            service = new UsuarioService();
            service.actualizarRegistro(usuario);
            listaRegistros = (ArrayList<Usuario>) service.obtenerRegistros();
            return SUCCESS;
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
            return ERROR;
        }
    }
    public String obtenerRegistro()throws Exception{
        try{
            service = new UsuarioService();
            service.obtenerRegistro(usuario.getId());
            listaRegistros = (ArrayList<Usuario>) service.obtenerRegistros();
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            return ERROR;
        }

    }
    
    
}
