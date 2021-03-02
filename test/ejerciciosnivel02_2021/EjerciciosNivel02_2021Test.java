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

    /**
     * Test of quitaAcentos method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        String cadena = "";
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        String expResult = "";
        String result = instance.quitaAcentos(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esEscaleraDePalabras method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testEsEscaleraDePalabras() {
        System.out.println("esEscaleraDePalabras");
        char[][] listaPalabras = null;
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        boolean expResult = false;
        boolean result = instance.esEscaleraDePalabras(listaPalabras);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of costeErroresADN method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testCosteErroresADN() {
        System.out.println("costeErroresADN");
        String uno = "";
        String dos = "";
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        int expResult = 0;
        int result = instance.costeErroresADN(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDuplicate method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testFindDuplicate() {
        System.out.println("findDuplicate");
        int[] listaNumeros = null;
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        int expResult = 0;
        int result = instance.findDuplicate(listaNumeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculadoraRPN method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testCalculadoraRPN() {
        System.out.println("calculadoraRPN");
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();

        assertEquals("35.0", instance.calculadoraRPN( new String[]{"3", "2","+", "7", "*"}));
        assertEquals("49.0", instance.calculadoraRPN( new String[]{"5", "2","+", "7", "*"}));
        assertEquals("10.0", instance.calculadoraRPN( new String[]{"2", "4","/", "5", "*"}));
        assertEquals("No se puede dividir entre cero, imbécil", instance.calculadoraRPN( new String[]{"0", "4","/", "5", "*"}));
        assertEquals("ERROR", instance.calculadoraRPN( new String[]{"2", "/","4", "5", "*"}));
    }



 
    
}
