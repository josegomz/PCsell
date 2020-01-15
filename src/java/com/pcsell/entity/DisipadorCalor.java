package com.pcsell.entity;
// Generated 14/01/2020 01:47:30 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * DisipadorCalor generated by hbm2java
 */
public class DisipadorCalor  implements java.io.Serializable {


     private long id;
     private Imagen imagen;
     private String marca;
     private String modelo;
     private BigDecimal tdp;
     private Integer tubosTermicos;
     private BigDecimal ancho;
     private BigDecimal alto;
     private BigDecimal precio;
     private Integer cantidad;
     private String descripcion;
     private Set procesadorDisipadors = new HashSet(0);
     private Set computadoras = new HashSet(0);

    public DisipadorCalor() {
    }

	
    public DisipadorCalor(long id, Imagen imagen, String marca, String modelo, BigDecimal precio) {
        this.id = id;
        this.imagen = imagen;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public DisipadorCalor(long id, Imagen imagen, String marca, String modelo, BigDecimal tdp, Integer tubosTermicos, BigDecimal ancho, BigDecimal alto, BigDecimal precio, Integer cantidad, String descripcion, Set procesadorDisipadors, Set computadoras) {
       this.id = id;
       this.imagen = imagen;
       this.marca = marca;
       this.modelo = modelo;
       this.tdp = tdp;
       this.tubosTermicos = tubosTermicos;
       this.ancho = ancho;
       this.alto = alto;
       this.precio = precio;
       this.cantidad = cantidad;
       this.descripcion = descripcion;
       this.procesadorDisipadors = procesadorDisipadors;
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
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public BigDecimal getTdp() {
        return this.tdp;
    }
    
    public void setTdp(BigDecimal tdp) {
        this.tdp = tdp;
    }
    public Integer getTubosTermicos() {
        return this.tubosTermicos;
    }
    
    public void setTubosTermicos(Integer tubosTermicos) {
        this.tubosTermicos = tubosTermicos;
    }
    public BigDecimal getAncho() {
        return this.ancho;
    }
    
    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }
    public BigDecimal getAlto() {
        return this.alto;
    }
    
    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProcesadorDisipadors() {
        return this.procesadorDisipadors;
    }
    
    public void setProcesadorDisipadors(Set procesadorDisipadors) {
        this.procesadorDisipadors = procesadorDisipadors;
    }
    public Set getComputadoras() {
        return this.computadoras;
    }
    
    public void setComputadoras(Set computadoras) {
        this.computadoras = computadoras;
    }




}


