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
public class Tablero {

    int x;
    int y;
    public Tablero(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Tablero))return false;
        Tablero tmp=(Tablero)obj;
        return (this.x==tmp.x && this.y==tmp.y);
    }
    
    
    
    
}
