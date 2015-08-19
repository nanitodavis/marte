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
    public void archivoExiste()throws FileNotFoundException{
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
    public void leerYEjecutrTodoElArchivo() throws FileNotFoundException{
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        PosicionRobot esperada = new PosicionRobot(1, 3, 'N');
        PosicionRobot esperada2 = new PosicionRobot(5, 1, 'E');
        Tablero t = new Tablero (6, 7);
        Instrucciones i1 = new Instrucciones("IAIAIAIAA");
        Instrucciones i2 = new Instrucciones("AADAADADDA");
        PosicionRobot r = new PosicionRobot(1, 2, 'N');
        if(x.hayMasLineas()){
            r.moverRobot(i1, t);
            Assert.assertEquals(esperada, r);
        }
        
        r = new PosicionRobot(3, 3, 'E');
        
        if(x.hayMasLineas()){
            r.moverRobot(i2, t);
            Assert.assertEquals(esperada2, r);
        }
        
    }
}
