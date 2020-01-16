package com.pcsell.entity;
// Generated 16/01/2020 08:44:30 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private long id;
     private Computadora computadora;
     private Usuario usuario;
     private Date fechaCompra;
     private int cantidad;
     private BigDecimal costo;
     private BigDecimal costoEnvio;
     private BigDecimal costoTotal;
     private String lugarEnvio;
     private String referencias;
     private String codigoPostal;
     private String telefono;

    public Venta() {
    }

	
    public Venta(long id, Computadora computadora, Usuario usuario, Date fechaCompra, int cantidad, BigDecimal costo, BigDecimal costoTotal, String lugarEnvio, String codigoPostal, String telefono) {
        this.id = id;
        this.computadora = computadora;
        this.usuario = usuario;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.costo = costo;
        this.costoTotal = costoTotal;
        this.lugarEnvio = lugarEnvio;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }
    public Venta(long id, Computadora computadora, Usuario usuario, Date fechaCompra, int cantidad, BigDecimal costo, BigDecimal costoEnvio, BigDecimal costoTotal, String lugarEnvio, String referencias, String codigoPostal, String telefono) {
       this.id = id;
       this.computadora = computadora;
       this.usuario = usuario;
       this.fechaCompra = fechaCompra;
       this.cantidad = cantidad;
       this.costo = costo;
       this.costoEnvio = costoEnvio;
       this.costoTotal = costoTotal;
       this.lugarEnvio = lugarEnvio;
       this.referencias = referencias;
       this.codigoPostal = codigoPostal;
       this.telefono = telefono;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Computadora getComputadora() {
        return this.computadora;
    }
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getCosto() {
        return this.costo;
    }
    
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    public BigDecimal getCostoEnvio() {
        return this.costoEnvio;
    }
    
    public void setCostoEnvio(BigDecimal costoEnvio) {
        this.costoEnvio = costoEnvio;
    }
    public BigDecimal getCostoTotal() {
        return this.costoTotal;
    }
    
    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }
    public String getLugarEnvio() {
        return this.lugarEnvio;
    }
    
    public void setLugarEnvio(String lugarEnvio) {
        this.lugarEnvio = lugarEnvio;
    }
    public String getReferencias() {
        return this.referencias;
    }
    
    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}


