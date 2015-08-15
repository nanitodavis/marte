package com.mycompany.ingswii;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clave-e205
 */
public class Coordenada {

    int x;
    int y;
    public Coordenada(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Coordenada))return false;
        Coordenada tmp=(Coordenada)obj;
        return (this.x==tmp.x && this.y==tmp.y);
    }
    
    
    
    
}
