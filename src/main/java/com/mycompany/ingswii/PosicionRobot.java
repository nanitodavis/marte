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
    int x;
    int y;
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
    
}
