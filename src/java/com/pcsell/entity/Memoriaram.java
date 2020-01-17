package com.pcsell.entity;
// Generated 17/01/2020 02:39:01 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Memoriaram generated by hbm2java
 */
public class Memoriaram  implements java.io.Serializable {


     private long id;
     private Imagen imagen;
     private String marca;
     private String modelo;
     private BigDecimal velocidad;
     private int capacidad;
     private BigDecimal precio;
     private String tipo;
     private Integer cantidad;
     private String descripcion;
     private Set computadorasForIdmemoriaramadicional = new HashSet(0);
     private Set computadorasForIdmemoriaram = new HashSet(0);

    public Memoriaram() {
    }

	
    public Memoriaram(long id, Imagen imagen, String marca, String modelo, BigDecimal velocidad, int capacidad, BigDecimal precio) {
        this.id = id;
        this.imagen = imagen;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    public Memoriaram(long id, Imagen imagen, String marca, String modelo, BigDecimal velocidad, int capacidad, BigDecimal precio, String tipo, Integer cantidad, String descripcion, Set computadorasForIdmemoriaramadicional, Set computadorasForIdmemoriaram) {
       this.id = id;
       this.imagen = imagen;
       this.marca = marca;
       this.modelo = modelo;
       this.velocidad = velocidad;
       this.capacidad = capacidad;
       this.precio = precio;
       this.tipo = tipo;
       this.cantidad = cantidad;
       this.descripcion = descripcion;
       this.computadorasForIdmemoriaramadicional = computadorasForIdmemoriaramadicional;
       this.computadorasForIdmemoriaram = computadorasForIdmemoriaram;
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
    public BigDecimal getVelocidad() {
        return this.velocidad;
    }
    
    public void setVelocidad(BigDecimal velocidad) {
        this.velocidad = velocidad;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public Set getComputadorasForIdmemoriaramadicional() {
        return this.computadorasForIdmemoriaramadicional;
    }
    
    public void setComputadorasForIdmemoriaramadicional(Set computadorasForIdmemoriaramadicional) {
        this.computadorasForIdmemoriaramadicional = computadorasForIdmemoriaramadicional;
    }
    public Set getComputadorasForIdmemoriaram() {
        return this.computadorasForIdmemoriaram;
    }
    
    public void setComputadorasForIdmemoriaram(Set computadorasForIdmemoriaram) {
        this.computadorasForIdmemoriaram = computadorasForIdmemoriaram;
    }




}

