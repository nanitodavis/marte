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
public class Marte {
    Tablero tablero;
    ArrayList <Robot> robots;
    Lector lector;
    
    public Marte(Lector lector) throws IOException {
        tablero = new Tablero();
        tablero.crearTablero(lector);
        robots = new ArrayList<Robot>();
    }

    public void ponerRobot() throws IOException {
        Robot robot = new Robot();
        int rx,ry,ra=0;
        char apunta='N';
        String [] lineas = lector.leerInstrucciones().split("\n");
        for(int cont=0;cont<lineas.length;cont+=2){
            rx=Character.getNumericValue(lineas[cont].charAt(0));
            ry=Character.getNumericValue(lineas[cont].charAt(2));
            apunta=(lineas[cont].charAt(4));
            switch (apunta){
                case 'N':
                    ra=0;
                    break;
                case 'S':
                    ra=180;
                    break;
                case 'E':
                    ra=90;
                    break;
                case 'W':
                    ra=270;
                    break;
            }
            robot = new Robot(rx, ry, ra);
            robots.add(robot);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
