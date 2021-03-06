package com.pcsell.entity;
// Generated 17/01/2020 02:39:01 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marcaprocesador generated by hbm2java
 */
public class Marcaprocesador  implements java.io.Serializable {


     private long id;
     private Imagen imagen;
     private String nombre;
     private Set procesadordisipadors = new HashSet(0);
     private Set tarjetamadres = new HashSet(0);
     private Set procesadors = new HashSet(0);

    public Marcaprocesador() {
    }

	
    public Marcaprocesador(long id, Imagen imagen, String nombre) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
    }
    public Marcaprocesador(long id, Imagen imagen, String nombre, Set procesadordisipadors, Set tarjetamadres, Set procesadors) {
       this.id = id;
       this.imagen = imagen;
       this.nombre = nombre;
       this.procesadordisipadors = procesadordisipadors;
       this.tarjetamadres = tarjetamadres;
       this.procesadors = procesadors;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Imagen getImagen() {
        return this.imagen;
    }
    
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getProcesadordisipadors() {
        return this.procesadordisipadors;
    }
    
    public void setProcesadordisipadors(Set procesadordisipadors) {
        this.procesadordisipadors = procesadordisipadors;
    }
    public Set getTarjetamadres() {
        return this.tarjetamadres;
    }
    
    public void setTarjetamadres(Set tarjetamadres) {
        this.tarjetamadres = tarjetamadres;
    }
    public Set getProcesadors() {
        return this.procesadors;
    }
    
    public void setProcesadors(Set procesadors) {
        this.procesadors = procesadors;
    }




}


