/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package digits;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrator
 */
public class PlayDigitsTest {
    
    public PlayDigitsTest() {
    }
    
    @Test
    public void testDigPow89with1() {
        System.out.println("digPow");
        int n = 89;
        int p = 1;
        int expResult = 0;
        int result = PlayDigits.digPow(n, p);
        assertEquals(1, result);
    }
    
    @Test
    public void testDigPow92with2() {
        System.out.println("digPow");
        int n = 92;
        int p = 2;
        int expResult = 0;
        int result = PlayDigits.digPow(n, p);
        assertEquals(-1, result);
    }
    
    @Test
    public void testDigPow46288with3() {
        System.out.println("digPow");
        int n = 46288;
        int p = 3;
        int expResult = 0;
        int result = PlayDigits.digPow(n, p);
        assertEquals(51, result);
    }
    
}
