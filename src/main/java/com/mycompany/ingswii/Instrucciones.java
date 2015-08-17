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
    char [] cadenaInstruccion;
    int posActual;
    
    public Instrucciones(String s){
        cadenaInstruccion=s.toCharArray();
        posActual=0;
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
        String res="";
        for(int cont=0;cont<cadenaInstruccion.length;cont++){
            res+=cadenaInstruccion[0];
        }
        return res;
    }

    char getInstruccion() {
        char res = 'Q';
        if(posActual<cadenaInstruccion.length)
            res = cadenaInstruccion[posActual];
        posActual++;
        return res;
    }
}
