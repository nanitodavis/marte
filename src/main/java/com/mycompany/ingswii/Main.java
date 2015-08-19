/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ingswii;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author nanito
 */
public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Marte marte = new Marte();
        Lector lector = new Lector();
        lector.cargarArchivo("src/main/resources/reglas.txt");
        marte.cargarTablero(lector.getCoordenadaInicial());
        for(int cont=1;cont<lector.totalLineas;cont+=2){
        marte.cargarRobot(lector.getPosicionRobot());
        marte.cargarInstrucciones(lector.getInstruciones());
        marte.moverRobot();
        System.out.println(marte.verRespuesta());
        }
    }
    
}
