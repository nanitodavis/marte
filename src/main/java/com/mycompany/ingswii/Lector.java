package com.mycompany.ingswii;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nanito
 */
public class Lector {
    File file;
    BufferedReader br;
    FileReader fr;
      String primeraLinea;
   
    
    public Lector()throws FileNotFoundException{
        
    }
    public void cargarArchivo(String ruta) throws FileNotFoundException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        file = new File(ruta);
        fr = new FileReader(file);
        br = new BufferedReader(fr);
    }

    private  String leerLineaArchivo() throws IOException{
       primeraLinea=br.readLine();
       return primeraLinea;
    }
    
    public String leerInstrucciones()throws IOException{
        String res = "";
        String probar=null;
        probar = br.readLine();
        for(;(probar=br.readLine()) != null;){
            res+=probar+"\n";
        }
        br.close();
        return res;
    }

    
    public Coordenada getCoordenadaInicial() throws IOException {
        if(primeraLinea==null)
            leerLineaArchivo();
        String coo[]=this.primeraLinea.split(" ");
        int x=Integer.parseInt(coo[0]);
        int y=Integer.parseInt(coo[1]);

        return new Coordenada(x,y);
    }
}
