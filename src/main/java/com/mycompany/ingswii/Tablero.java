package com.mycompany.ingswii;


import com.mycompany.ingswii.Lector;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nanito
 */
public class Tablero {
    int x, y;
    int [][] tablero;
    
    public Tablero(){
        x=0;
        y=0;
        tablero = new int [x][y];
    }
    
    public Tablero(int x, int y){
        this.x=x;
        this.y=y;
        tablero = new int[x][y];
    }
    
    public void crearTablero(Lector lector) throws IOException {
        String xy = lector.leerLineaArchivo();
        x=Character.getNumericValue(xy.charAt(0));
        y=Character.getNumericValue(xy.charAt(2));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
