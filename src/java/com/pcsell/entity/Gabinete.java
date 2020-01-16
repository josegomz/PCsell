package com.pcsell.entity;
// Generated 16/01/2020 08:44:30 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Gabinete generated by hbm2java
 */
public class Gabinete  implements java.io.Serializable {


     private long id;
     private Imagen imagen;
     private TamanioTm tamanioTm;
     private String marca;
     private String modelo;
     private String tamaño;
     private String descripcion;
     private BigDecimal precio;
     private Integer cantidad;
     private Set computadoras = new HashSet(0);

    public Gabinete() {
    }

	
    public Gabinete(long id, Imagen imagen, TamanioTm tamanioTm, String marca, String modelo, String tamaño, BigDecimal precio) {
        this.id = id;
        this.imagen = imagen;
        this.tamanioTm = tamanioTm;
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.precio = precio;
    }
    public Gabinete(long id, Imagen imagen, TamanioTm tamanioTm, String marca, String modelo, String tamaño, String descripcion, BigDecimal precio, Integer cantidad, Set computadoras) {
       this.id = id;
       this.imagen = imagen;
       this.tamanioTm = tamanioTm;
       this.marca = marca;
       this.modelo = modelo;
       this.tamaño = tamaño;
       this.descripcion = descripcion;
       this.precio = precio;
       this.cantidad = cantidad;
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
    public TamanioTm getTamanioTm() {
        return this.tamanioTm;
    }
    
    public void setTamanioTm(TamanioTm tamanioTm) {
        this.tamanioTm = tamanioTm;
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
    public String getTamaño() {
        return this.tamaño;
    }
    
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public Set getComputadoras() {
        return this.computadoras;
    }
    
    public void setComputadoras(Set computadoras) {
        this.computadoras = computadoras;
    }




}


