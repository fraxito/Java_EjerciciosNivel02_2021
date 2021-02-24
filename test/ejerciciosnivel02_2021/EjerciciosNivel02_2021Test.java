/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel02_2021;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xp
 */
public class EjerciciosNivel02_2021Test {
    
    public EjerciciosNivel02_2021Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }







    /**
     * Test of strStr method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testStrStr() {
        System.out.println("strStr");
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();

        assertEquals(6, instance.strStr("hola Helios!", "el") );
        assertEquals(5, instance.strStr("hola Mundo", "Mun") );
        assertEquals(-1, instance.strStr("hola MynMu", "Mun") );
        assertEquals(6, instance.strStr("hola MMunn", "Mun") );
        assertEquals(-1, instance.strStr("Mumn", "mun") );
        assertEquals(-1, instance.strStr("", "") );
        assertEquals(-1, instance.strStr("hola me-llamo ", "me_") );


    }

 
    
}
