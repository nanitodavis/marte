package com.mycompany.ingswii;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
    String linea;
    int totalLineas;
    
    public Lector()throws FileNotFoundException{
        
    }
    
    public void cargarArchivo(String ruta) throws FileNotFoundException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        file = new File(ruta);
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        totalLineas=this.numeroLineas();
    }

    private  String leerLineaArchivo() throws IOException{
       linea=br.readLine();
       return linea;
    }
    
    public int numeroLineas()throws IOException{
        FileReader f = new FileReader(file);
        BufferedReader p = new BufferedReader(f);
        int res = 0;
        String probar=null;
        probar = p.readLine();
        res+=1;
        for(;(probar=p.readLine()) != null;){
            res+=1;
        }
        return res;
    }

    
    public Tablero getCoordenadaInicial() throws IOException {
        if(linea==null)
        leerLineaArchivo();
        String coo[]=this.linea.split(" ");
        int x=Integer.parseInt(coo[0]);
        int y=Integer.parseInt(coo[1]);

        return new Tablero(x,y);
    }
      
    public PosicionRobot getPosicionRobot() throws IOException{
        for(int cont=0;cont<100000;cont++){
            if(linea==null){
               leerLineaArchivo();
                cont++;
            }
             else if (!((linea.charAt(0)=='I')|| (linea.charAt(0)=='D')|| (linea.charAt(0)=='A'))&&linea.toCharArray().length==5){
                 cont=100000;
            }
             else{
                leerLineaArchivo();
                cont++;
             }
        }
        String pr [] = this.linea.split(" ");
        int x=Integer.parseInt(pr[0]);
        int y=Integer.parseInt(pr[1]);
        char a = pr[2].charAt(0);
        return new PosicionRobot(x, y, a);   
    }

    public Instrucciones getInstruciones() throws IOException {
        
        for(int cont=0;cont<100000;cont++){
            if(linea==null){
               leerLineaArchivo();
                cont++;
            }
             else if ((linea.charAt(0)=='I')|| (linea.charAt(0)=='D')|| (linea.charAt(0)=='A')){
                 cont=100000;
             }
             else{
                leerLineaArchivo();
                cont++;
             }
        }
        String s = linea;
        return new Instrucciones(s);
    }

    public boolean hayMasLineas() throws FileNotFoundException {
        boolean hayLineas = false;
        Scanner s = new Scanner(fr);
        if(s.hasNextLine())
            hayLineas=true;
        return hayLineas;
    }
    
}
