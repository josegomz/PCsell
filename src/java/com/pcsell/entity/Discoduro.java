package com.pcsell.entity;
// Generated 17/01/2020 02:39:01 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Discoduro generated by hbm2java
 */
public class Discoduro  implements java.io.Serializable {


     private long id;
     private Imagen imagen;
     private String marca;
     private String modelo;
     private String factordeforma;
     private int rpm;
     private String interfaz;
     private int capacidad;
     private String tipo;
     private BigDecimal precio;
     private String descripcion;
     private Set computadorasForIddiscoduro = new HashSet(0);
     private Set computadorasForIddiscoduroadicional = new HashSet(0);

    public Discoduro() {
    }

	
    public Discoduro(long id, Imagen imagen, String marca, String modelo, String factordeforma, int rpm, String interfaz, int capacidad, BigDecimal precio) {
        this.id = id;
        this.imagen = imagen;
        this.marca = marca;
        this.modelo = modelo;
        this.factordeforma = factordeforma;
        this.rpm = rpm;
        this.interfaz = interfaz;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    public Discoduro(long id, Imagen imagen, String marca, String modelo, String factordeforma, int rpm, String interfaz, int capacidad, String tipo, BigDecimal precio, String descripcion, Set computadorasForIddiscoduro, Set computadorasForIddiscoduroadicional) {
       this.id = id;
       this.imagen = imagen;
       this.marca = marca;
       this.modelo = modelo;
       this.factordeforma = factordeforma;
       this.rpm = rpm;
       this.interfaz = interfaz;
       this.capacidad = capacidad;
       this.tipo = tipo;
       this.precio = precio;
       this.descripcion = descripcion;
       this.computadorasForIddiscoduro = computadorasForIddiscoduro;
       this.computadorasForIddiscoduroadicional = computadorasForIddiscoduroadicional;
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
    public String getFactordeforma() {
        return this.factordeforma;
    }
    
    public void setFactordeforma(String factordeforma) {
        this.factordeforma = factordeforma;
    }
    public int getRpm() {
        return this.rpm;
    }
    
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public String getInterfaz() {
        return this.interfaz;
    }
    
    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getComputadorasForIddiscoduro() {
        return this.computadorasForIddiscoduro;
    }
    
    public void setComputadorasForIddiscoduro(Set computadorasForIddiscoduro) {
        this.computadorasForIddiscoduro = computadorasForIddiscoduro;
    }
    public Set getComputadorasForIddiscoduroadicional() {
        return this.computadorasForIddiscoduroadicional;
    }
    
    public void setComputadorasForIddiscoduroadicional(Set computadorasForIddiscoduroadicional) {
        this.computadorasForIddiscoduroadicional = computadorasForIddiscoduroadicional;
    }




}

