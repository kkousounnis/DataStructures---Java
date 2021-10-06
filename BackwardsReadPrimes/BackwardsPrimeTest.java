/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication2;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author administrator
 */
public class BackwardsPrimeTest {
    
    public BackwardsPrimeTest() {
    }   
    
    @Test
    public void testBackwardsPrime() {
        long start = 1;
        long end = 100;
        String expResult = "13 17 31 37 71 73 79 97";
        String result = BackwardsPrime.backwardsPrime(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }   
    
    @Test
    public void testBackwardsPrime9900to10000() {
        long start = 9900;
        long end = 10000;
        String expResult = "9923 9931 9941 9967";
        String result = BackwardsPrime.backwardsPrime(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }   
      
    
}
