package com.pcsell.entity;
// Generated 14/01/2020 01:47:30 PM by Hibernate Tools 4.3.1


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
     private Set discoDuros = new HashSet(0);
     private Set tarjetaVideos = new HashSet(0);
     private Set tarjetaMadres = new HashSet(0);
     private Set marcaProcesadors = new HashSet(0);
     private Set gabinetes = new HashSet(0);
     private Set procesadors = new HashSet(0);
     private Set fuentePoders = new HashSet(0);
     private Set disipadorCalors = new HashSet(0);
     private Set memoriaRams = new HashSet(0);

    public Imagen() {
    }

	
    public Imagen(long id, String nombre, String tipo, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ruta = ruta;
    }
    public Imagen(long id, String nombre, String tipo, String ruta, Set discoDuros, Set tarjetaVideos, Set tarjetaMadres, Set marcaProcesadors, Set gabinetes, Set procesadors, Set fuentePoders, Set disipadorCalors, Set memoriaRams) {
       this.id = id;
       this.nombre = nombre;
       this.tipo = tipo;
       this.ruta = ruta;
       this.discoDuros = discoDuros;
       this.tarjetaVideos = tarjetaVideos;
       this.tarjetaMadres = tarjetaMadres;
       this.marcaProcesadors = marcaProcesadors;
       this.gabinetes = gabinetes;
       this.procesadors = procesadors;
       this.fuentePoders = fuentePoders;
       this.disipadorCalors = disipadorCalors;
       this.memoriaRams = memoriaRams;
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
    public Set getDiscoDuros() {
        return this.discoDuros;
    }
    
    public void setDiscoDuros(Set discoDuros) {
        this.discoDuros = discoDuros;
    }
    public Set getTarjetaVideos() {
        return this.tarjetaVideos;
    }
    
    public void setTarjetaVideos(Set tarjetaVideos) {
        this.tarjetaVideos = tarjetaVideos;
    }
    public Set getTarjetaMadres() {
        return this.tarjetaMadres;
    }
    
    public void setTarjetaMadres(Set tarjetaMadres) {
        this.tarjetaMadres = tarjetaMadres;
    }
    public Set getMarcaProcesadors() {
        return this.marcaProcesadors;
    }
    
    public void setMarcaProcesadors(Set marcaProcesadors) {
        this.marcaProcesadors = marcaProcesadors;
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
    public Set getFuentePoders() {
        return this.fuentePoders;
    }
    
    public void setFuentePoders(Set fuentePoders) {
        this.fuentePoders = fuentePoders;
    }
    public Set getDisipadorCalors() {
        return this.disipadorCalors;
    }
    
    public void setDisipadorCalors(Set disipadorCalors) {
        this.disipadorCalors = disipadorCalors;
    }
    public Set getMemoriaRams() {
        return this.memoriaRams;
    }
    
    public void setMemoriaRams(Set memoriaRams) {
        this.memoriaRams = memoriaRams;
    }




}


