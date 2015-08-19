/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.ingswii.Marte;
import com.mycompany.ingswii.Instrucciones;
import com.mycompany.ingswii.PosicionRobot;
import com.mycompany.ingswii.Tablero;
import com.mycompany.ingswii.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nanito
 */
public class Pruebas {
    
    public Pruebas() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void archivoExiste()throws FileNotFoundException, IOException{
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
    }
    
 
    
    @Test
    public void laCoordenadaInicialEsCorrecta() throws FileNotFoundException, IOException{
        Tablero esperada=new Tablero(7,6);
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        Tablero c=x.getCoordenadaInicial();
        Assert.assertEquals(c,esperada);
    }
    
    @Test
    public void posicionInicialRobotEsValida() throws FileNotFoundException, IOException{
        PosicionRobot esperada = new PosicionRobot(1, 2, 'N');
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        PosicionRobot obtenida = x.getPosicionRobot();
        Assert.assertEquals(esperada, obtenida);
    }
    
    @Test
    public void instruccionesParaMoverElRobot() throws FileNotFoundException, IOException{
        Instrucciones esperada = new Instrucciones ("IAIAIAIAA");
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        Instrucciones obtenida = x.getInstruciones();
        Assert.assertEquals(esperada, obtenida);
    }
    
    @Test
    public void moverAlRobotMedianteInstrucciones(){
        Tablero t = new Tablero(6, 7);
        PosicionRobot posicionFinal = new PosicionRobot(5, 1, 'E');
        Instrucciones i = new Instrucciones ("AADAADADDA");
        PosicionRobot r = new PosicionRobot (3, 3, 'E');
        r.moverRobot(i, t);
        Assert.assertEquals(posicionFinal, r);   
    }   
    
    @Test
    public void leerYEjecutrTodoElArchivo() throws FileNotFoundException, IOException{
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        Tablero t = x.getCoordenadaInicial();
        Instrucciones i;
        PosicionRobot r;
        for(int cont = 1;cont<x.numeroLineas();cont+=2){
            r=x.getPosicionRobot();
            i=x.getInstruciones();
            r.moverRobot(i, t);
            if(cont==1){
                PosicionRobot esperada= new PosicionRobot(1, 3, 'N');
                Assert.assertEquals(esperada, r);  
            }
            else if (cont==3){
                PosicionRobot esperada= new PosicionRobot(5, 1, 'E');
                Assert.assertEquals(esperada, r);  
            }
        }
        
    }
}
