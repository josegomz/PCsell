package com.pcsell.entity;
// Generated 16/01/2020 11:03:10 PM by Hibernate Tools 4.3.1



/**
 * Procesadordisipador generated by hbm2java
 */
public class Procesadordisipador  implements java.io.Serializable {


     private long id;
     private Disipadorcalor disipadorcalor;
     private Marcaprocesador marcaprocesador;

    public Procesadordisipador() {
    }

    public Procesadordisipador(long id, Disipadorcalor disipadorcalor, Marcaprocesador marcaprocesador) {
       this.id = id;
       this.disipadorcalor = disipadorcalor;
       this.marcaprocesador = marcaprocesador;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Disipadorcalor getDisipadorcalor() {
        return this.disipadorcalor;
    }
    
    public void setDisipadorcalor(Disipadorcalor disipadorcalor) {
        this.disipadorcalor = disipadorcalor;
    }
    public Marcaprocesador getMarcaprocesador() {
        return this.marcaprocesador;
    }
    
    public void setMarcaprocesador(Marcaprocesador marcaprocesador) {
        this.marcaprocesador = marcaprocesador;
    }




}


