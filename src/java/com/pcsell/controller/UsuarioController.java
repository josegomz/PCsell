/*
    Universidad de la Sierra Sur 
    Licenciatura en Informática  Grupo: 706 
    Equipo: Gómez Sánchez José Benito
            Nasario Anselmo Belisario
            Padilla Bustamante Uriel Gustavo
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
/*
  Controlador de modulo usuario
*/
public class UsuarioController {
    IUsuarioService service;
    private Usuario usuario;
    private long id;
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
    public String obtenerRegistro(long id)throws Exception{
        try{
            service = new UsuarioService();
            usuario = service.obtenerRegistro(id);
            return SUCCESS;
        }catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            return ERROR;
        }

    }
    
    
    
}
