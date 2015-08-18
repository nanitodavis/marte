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
public class PosicionRobot {
    public int x;
    public int y;
    char apunta;

    public PosicionRobot(int x, int y, char apun) {
        this.x=x;
        this.y=y;
        apunta=apun;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof PosicionRobot))return false;
        PosicionRobot tmp=(PosicionRobot)obj;
        return (this.x==tmp.x && this.y==tmp.y && apunta==tmp.apunta);
    }

    public void moverRobot(Instrucciones i, Tablero t) {
        char instruccionActual= i.getInstruccion();
        for(int cont=0;cont<i.cadenaInstruccion.length;cont++){
            if(instruccionActual=='I'){
                switch (apunta){
                    case 'N':
                        apunta='O';
                        break;
                    case 'S':
                        apunta='E';
                        break;
                    case 'E':
                        apunta='N';
                        break;
                    case 'O':
                        apunta='S';
                        break;
                }
            }
            else if(instruccionActual=='D'){
                switch (apunta){
                    case 'N':
                        apunta='E';
                        break;
                    case 'S':
                        apunta='O';
                        break;
                    case 'E':
                        apunta='S';
                        break;
                    case 'O':
                        apunta='N';
                        break;
                }
            }
            else if(instruccionActual=='A'){
                switch (apunta){
                    case 'N':
                        if(t.y>=(this.y+1)){
                            this.y+=1;
                        }
                        break;
                    case 'S':
                        if(0<=(this.y-1)){
                            this.y-=1;
                        }
                        break;
                    case 'E':
                        if(t.x>=(this.x+1)){
                            this.x+=1;
                        }
                        break;
                    case 'O':
                        if(0<=(this.x-1)){
                            this.x-=1;
                        }
                        break;
                }
            }
           instruccionActual=i.getInstruccion();
        }
    } 
    
    @Override
    public String toString(){
        return x+" "+y+" "+apunta;
    }
}