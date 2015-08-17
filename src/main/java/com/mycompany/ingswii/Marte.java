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
public class Marte {
    Tablero tablero;
    PosicionRobot robot;
    Instrucciones instruccion;
    String respuesta;

    public void cargarTablero(Tablero t) {
        tablero = t;
    }

    public void cargarRobot(PosicionRobot r) {
        robot = r;
    }

    public void cargarInstrucciones(Instrucciones i) {
        instruccion = i;
    }

    public void moverRobot() {
        
    }
}
