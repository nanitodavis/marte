package com.mycompany.ingswii;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nanito
 */
public class Instrucciones {
    String cadenaInstruccion;
    
    public Instrucciones(String s){
        cadenaInstruccion=s;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Instrucciones))return false;
        Instrucciones tmp=(Instrucciones)obj;
        return ((this.cadenaInstruccion).equals(tmp.cadenaInstruccion));
    }
    
    @Override
    public String toString(){
        return cadenaInstruccion;
    }
}
