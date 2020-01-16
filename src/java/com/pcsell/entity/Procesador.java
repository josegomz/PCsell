package com.pcsell.entity;
// Generated 16/01/2020 08:44:30 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Procesador generated by hbm2java
 */
public class Procesador  implements java.io.Serializable {


     private long id;
     private Imagen imagen;
     private MarcaProcesador marcaProcesador;
     private String modelo;
     private int nucleos;
     private Integer hilosDeProcesamiento;
     private BigDecimal frecuenciaBase;
     private BigDecimal tdp;
     private BigDecimal precio;
     private Integer cantidades;
     private String descripcion;
     private Set computadoras = new HashSet(0);

    public Procesador() {
    }

	
    public Procesador(long id, Imagen imagen, MarcaProcesador marcaProcesador, String modelo, int nucleos, BigDecimal precio) {
        this.id = id;
        this.imagen = imagen;
        this.marcaProcesador = marcaProcesador;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.precio = precio;
    }
    public Procesador(long id, Imagen imagen, MarcaProcesador marcaProcesador, String modelo, int nucleos, Integer hilosDeProcesamiento, BigDecimal frecuenciaBase, BigDecimal tdp, BigDecimal precio, Integer cantidades, String descripcion, Set computadoras) {
       this.id = id;
       this.imagen = imagen;
       this.marcaProcesador = marcaProcesador;
       this.modelo = modelo;
       this.nucleos = nucleos;
       this.hilosDeProcesamiento = hilosDeProcesamiento;
       this.frecuenciaBase = frecuenciaBase;
       this.tdp = tdp;
       this.precio = precio;
       this.cantidades = cantidades;
       this.descripcion = descripcion;
       this.computadoras = computadoras;
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
    public MarcaProcesador getMarcaProcesador() {
        return this.marcaProcesador;
    }
    
    public void setMarcaProcesador(MarcaProcesador marcaProcesador) {
        this.marcaProcesador = marcaProcesador;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNucleos() {
        return this.nucleos;
    }
    
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
    public Integer getHilosDeProcesamiento() {
        return this.hilosDeProcesamiento;
    }
    
    public void setHilosDeProcesamiento(Integer hilosDeProcesamiento) {
        this.hilosDeProcesamiento = hilosDeProcesamiento;
    }
    public BigDecimal getFrecuenciaBase() {
        return this.frecuenciaBase;
    }
    
    public void setFrecuenciaBase(BigDecimal frecuenciaBase) {
        this.frecuenciaBase = frecuenciaBase;
    }
    public BigDecimal getTdp() {
        return this.tdp;
    }
    
    public void setTdp(BigDecimal tdp) {
        this.tdp = tdp;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public Integer getCantidades() {
        return this.cantidades;
    }
    
    public void setCantidades(Integer cantidades) {
        this.cantidades = cantidades;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getComputadoras() {
        return this.computadoras;
    }
    
    public void setComputadoras(Set computadoras) {
        this.computadoras = computadoras;
    }




}


