/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clave-e205
 */
public class Singleton {
    private static Singleton instance=null; 
    private String s;
    
    
    private Singleton(){
        s="creado";
    }

    public static Singleton getInstance() {
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    
}
