/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ingswii;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Clock;

/**
 *
 * @author nanito
 */
public class Main {
    public static void main(String[]args) throws FileNotFoundException, IOException{
        Lector lector = new Lector("/home/clave-e205/Escritorio/tablero.txt");
        //System.out.println(lector.leerInstrucciones());
    }
}
