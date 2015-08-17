/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.ingswii.PosicionRobot;
import com.mycompany.ingswii.Coordenada;
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
        Coordenada esperada=new Coordenada(7,6);
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        Coordenada c=x.getCoordenadaInicial();
        //Assert.assertEquals(c,esperada);
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
    public void instruccionesParaMoverElRobot(){
        
    }
    
   
}
