/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adees
 */
public class Ejercicio2Test {
    
    public Ejercicio2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of maximoPalindromo method, of class Ejercicio2.
     */
    @Test
    public void testMaximoPalindromo() {
        System.out.println("maximoPalindromo");
        int limite = 101110;
        Ejercicio2 instance = new Ejercicio2();
        Long expResult = Integer.toUnsignedLong(101101);
        Long result = instance.maximoPalindromo(limite);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of maximoPalindromo method, of class Ejercicio2.
     */
    @Test
    public void testMaximoPalindromo2() {
        System.out.println("maximoPalindromo");
        int limite = 800000;
        Ejercicio2 instance = new Ejercicio2();
        Long expResult = Integer.toUnsignedLong(793397);
        Long result = instance.maximoPalindromo(limite);
        assertEquals(expResult, result);
    }
}
