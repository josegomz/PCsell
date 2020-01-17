package com.pcsell.entity;
// Generated 16/01/2020 11:03:10 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Computadora generated by hbm2java
 */
public class Computadora  implements java.io.Serializable {


     private long id;
     private Discoduro discoduroByDiscoduro;
     private Discoduro discoduroByDiscoduroadicional;
     private Disipadorcalor disipadorcalor;
     private Fuentepoder fuentepoder;
     private Gabinete gabinete;
     private Memoriaram memoriaramByMemoriaramadicional;
     private Memoriaram memoriaramByMemoriaram;
     private Procesador procesador;
     private Tarjetamadre tarjetamadre;
     private Tarjetavideo tarjetavideo;
     private BigDecimal costototal;
     private Set ventas = new HashSet(0);

    public Computadora() {
    }

	
    public Computadora(long id, Discoduro discoduroByDiscoduro, Discoduro discoduroByDiscoduroadicional, Disipadorcalor disipadorcalor, Fuentepoder fuentepoder, Gabinete gabinete, Memoriaram memoriaramByMemoriaramadicional, Memoriaram memoriaramByMemoriaram, Procesador procesador, Tarjetamadre tarjetamadre, Tarjetavideo tarjetavideo, BigDecimal costototal) {
        this.id = id;
        this.discoduroByDiscoduro = discoduroByDiscoduro;
        this.discoduroByDiscoduroadicional = discoduroByDiscoduroadicional;
        this.disipadorcalor = disipadorcalor;
        this.fuentepoder = fuentepoder;
        this.gabinete = gabinete;
        this.memoriaramByMemoriaramadicional = memoriaramByMemoriaramadicional;
        this.memoriaramByMemoriaram = memoriaramByMemoriaram;
        this.procesador = procesador;
        this.tarjetamadre = tarjetamadre;
        this.tarjetavideo = tarjetavideo;
        this.costototal = costototal;
    }
    public Computadora(long id, Discoduro discoduroByDiscoduro, Discoduro discoduroByDiscoduroadicional, Disipadorcalor disipadorcalor, Fuentepoder fuentepoder, Gabinete gabinete, Memoriaram memoriaramByMemoriaramadicional, Memoriaram memoriaramByMemoriaram, Procesador procesador, Tarjetamadre tarjetamadre, Tarjetavideo tarjetavideo, BigDecimal costototal, Set ventas) {
       this.id = id;
       this.discoduroByDiscoduro = discoduroByDiscoduro;
       this.discoduroByDiscoduroadicional = discoduroByDiscoduroadicional;
       this.disipadorcalor = disipadorcalor;
       this.fuentepoder = fuentepoder;
       this.gabinete = gabinete;
       this.memoriaramByMemoriaramadicional = memoriaramByMemoriaramadicional;
       this.memoriaramByMemoriaram = memoriaramByMemoriaram;
       this.procesador = procesador;
       this.tarjetamadre = tarjetamadre;
       this.tarjetavideo = tarjetavideo;
       this.costototal = costototal;
       this.ventas = ventas;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Discoduro getDiscoduroByDiscoduro() {
        return this.discoduroByDiscoduro;
    }
    
    public void setDiscoduroByDiscoduro(Discoduro discoduroByDiscoduro) {
        this.discoduroByDiscoduro = discoduroByDiscoduro;
    }
    public Discoduro getDiscoduroByDiscoduroadicional() {
        return this.discoduroByDiscoduroadicional;
    }
    
    public void setDiscoduroByDiscoduroadicional(Discoduro discoduroByDiscoduroadicional) {
        this.discoduroByDiscoduroadicional = discoduroByDiscoduroadicional;
    }
    public Disipadorcalor getDisipadorcalor() {
        return this.disipadorcalor;
    }
    
    public void setDisipadorcalor(Disipadorcalor disipadorcalor) {
        this.disipadorcalor = disipadorcalor;
    }
    public Fuentepoder getFuentepoder() {
        return this.fuentepoder;
    }
    
    public void setFuentepoder(Fuentepoder fuentepoder) {
        this.fuentepoder = fuentepoder;
    }
    public Gabinete getGabinete() {
        return this.gabinete;
    }
    
    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }
    public Memoriaram getMemoriaramByMemoriaramadicional() {
        return this.memoriaramByMemoriaramadicional;
    }
    
    public void setMemoriaramByMemoriaramadicional(Memoriaram memoriaramByMemoriaramadicional) {
        this.memoriaramByMemoriaramadicional = memoriaramByMemoriaramadicional;
    }
    public Memoriaram getMemoriaramByMemoriaram() {
        return this.memoriaramByMemoriaram;
    }
    
    public void setMemoriaramByMemoriaram(Memoriaram memoriaramByMemoriaram) {
        this.memoriaramByMemoriaram = memoriaramByMemoriaram;
    }
    public Procesador getProcesador() {
        return this.procesador;
    }
    
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    public Tarjetamadre getTarjetamadre() {
        return this.tarjetamadre;
    }
    
    public void setTarjetamadre(Tarjetamadre tarjetamadre) {
        this.tarjetamadre = tarjetamadre;
    }
    public Tarjetavideo getTarjetavideo() {
        return this.tarjetavideo;
    }
    
    public void setTarjetavideo(Tarjetavideo tarjetavideo) {
        this.tarjetavideo = tarjetavideo;
    }
    public BigDecimal getCostototal() {
        return this.costototal;
    }
    
    public void setCostototal(BigDecimal costototal) {
        this.costototal = costototal;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}


