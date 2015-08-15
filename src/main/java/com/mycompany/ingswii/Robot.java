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
public class Robot {
    int x;
    int y;
    int apuntando;
    
    public Robot(int x, int y, int apun){
        this.x = x;
        this.y = y;
        apuntando = apun;
    }
    
    public Robot(){
        x=0;
        y=0;
        apuntando=0;
    }
    
}
