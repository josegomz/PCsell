package com.pcsell.entity;
// Generated 17/01/2020 02:39:01 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private long id;
     private String nombre;
     private String tipo;
     private String ruta;
     private Set discoduros = new HashSet(0);
     private Set tarjetavideos = new HashSet(0);
     private Set tarjetamadres = new HashSet(0);
     private Set marcaprocesadors = new HashSet(0);
     private Set gabinetes = new HashSet(0);
     private Set procesadors = new HashSet(0);
     private Set fuentepoders = new HashSet(0);
     private Set disipadorcalors = new HashSet(0);
     private Set memoriarams = new HashSet(0);

    public Imagen() {
    }

	
    public Imagen(long id, String nombre, String tipo, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ruta = ruta;
    }
    public Imagen(long id, String nombre, String tipo, String ruta, Set discoduros, Set tarjetavideos, Set tarjetamadres, Set marcaprocesadors, Set gabinetes, Set procesadors, Set fuentepoders, Set disipadorcalors, Set memoriarams) {
       this.id = id;
       this.nombre = nombre;
       this.tipo = tipo;
       this.ruta = ruta;
       this.discoduros = discoduros;
       this.tarjetavideos = tarjetavideos;
       this.tarjetamadres = tarjetamadres;
       this.marcaprocesadors = marcaprocesadors;
       this.gabinetes = gabinetes;
       this.procesadors = procesadors;
       this.fuentepoders = fuentepoders;
       this.disipadorcalors = disipadorcalors;
       this.memoriarams = memoriarams;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public Set getDiscoduros() {
        return this.discoduros;
    }
    
    public void setDiscoduros(Set discoduros) {
        this.discoduros = discoduros;
    }
    public Set getTarjetavideos() {
        return this.tarjetavideos;
    }
    
    public void setTarjetavideos(Set tarjetavideos) {
        this.tarjetavideos = tarjetavideos;
    }
    public Set getTarjetamadres() {
        return this.tarjetamadres;
    }
    
    public void setTarjetamadres(Set tarjetamadres) {
        this.tarjetamadres = tarjetamadres;
    }
    public Set getMarcaprocesadors() {
        return this.marcaprocesadors;
    }
    
    public void setMarcaprocesadors(Set marcaprocesadors) {
        this.marcaprocesadors = marcaprocesadors;
    }
    public Set getGabinetes() {
        return this.gabinetes;
    }
    
    public void setGabinetes(Set gabinetes) {
        this.gabinetes = gabinetes;
    }
    public Set getProcesadors() {
        return this.procesadors;
    }
    
    public void setProcesadors(Set procesadors) {
        this.procesadors = procesadors;
    }
    public Set getFuentepoders() {
        return this.fuentepoders;
    }
    
    public void setFuentepoders(Set fuentepoders) {
        this.fuentepoders = fuentepoders;
    }
    public Set getDisipadorcalors() {
        return this.disipadorcalors;
    }
    
    public void setDisipadorcalors(Set disipadorcalors) {
        this.disipadorcalors = disipadorcalors;
    }
    public Set getMemoriarams() {
        return this.memoriarams;
    }
    
    public void setMemoriarams(Set memoriarams) {
        this.memoriarams = memoriarams;
    }




}


