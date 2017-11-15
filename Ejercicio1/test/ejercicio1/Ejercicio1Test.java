/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

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
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
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
     * Test of calcularMaximo method, of class Ejercicio1.
     */
    @Test
    public void testCalcularMaximo() {
        System.out.println("calcularMaximo");
        String num = "3675356291";
        int k = 5;
        Ejercicio1 instance = new Ejercicio1();
        Long expResult = Integer.toUnsignedLong(3150) ;
        Long result = instance.calcularMaximo(num, k);
        assertEquals(expResult, result);
    } 
    
     /**
     * Test of calcularMaximo method, of class Ejercicio1.
     */
    @Test
    public void testCalcularMaximo2() {
        System.out.println("calcularMaximo");
        String num = "2709360626";
        int k = 5;
        Ejercicio1 instance = new Ejercicio1();
        Long expResult = Integer.toUnsignedLong(0) ;
        Long result = instance.calcularMaximo(num, k);
        assertEquals(expResult, result);
    } 
}
