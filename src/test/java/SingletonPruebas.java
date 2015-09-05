/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author clave-e205
 */
public class SingletonPruebas {
    
    public SingletonPruebas() {
    }
    
    @Test
    public void crearSingleton(){
        Singleton s = Singleton.getInstance();
        assertEquals(s, Singleton.getInstance());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
