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
        boolean res=false;
        if(obj == null) return false;
        if(!(obj instanceof Instrucciones))return false;
        Instrucciones tmp=(Instrucciones)obj;
        for(int cont=0;cont<=tmp.cadenaInstruccion.length;cont++){
            if(this.cadenaInstruccion[cont]==tmp.cadenaInstruccion[cont]){
                 if(this.cadenaInstruccion.length==tmp.cadenaInstruccion.length){
                    return true;
            }
            }
            else if(this.cadenaInstruccion[cont]!=tmp.cadenaInstruccion[cont]){
                return false;
            }
        }
        return (res);
    }
    
    @Override
    public String toString(){
        String res="";
        for(int cont=0;cont<cadenaInstruccion.length;cont++){
            res+=cadenaInstruccion[cont];
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
