/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.ingswii.*;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    public void leerArchivo() throws FileNotFoundException, IOException{
        Lector x = new Lector();
        x.cargarArchivo("src/main/resources/reglas.txt");
        String dimenciones = x.leerLineaArchivo();
    }
    
    @Test
    public void crearTablero() throws FileNotFoundException, IOException{
        Lector x = new 
        Lector("/home/clave-e205/Escritorio/tablero.txt");
        Tablero tablero = new Tablero();
        tablero.crearTablero(x);
    }
    
    @Test
    public void posicionRobotEnTablero()throws FileNotFoundException, IOException{
        Robot robot = new Robot();
        Tablero tablero = new Tablero();
        Lector lector = new Lector("/home/clave-e205/Escritorio/tablero.txt");
        Marte marte = new Marte(lector);
        marte.ponerRobot();
    }
    
}
