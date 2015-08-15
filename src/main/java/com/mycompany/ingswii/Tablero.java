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
    int [][] tablero;
    
    public Tablero(Coordenada c){
        tablero = new int[c.x][c.y];
    }
    
    public void crearTablero(Lector lector) throws IOException {
        
    }
    
}
