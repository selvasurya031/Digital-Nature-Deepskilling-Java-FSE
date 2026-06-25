import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(30, result); 
        
        assertTrue(result > 0); 
 
        assertFalse(result < 0); 
 
        assertNull(null); 

        assertNotNull(calculator);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();

        int result = calculator.sub(10, 20);

        assertEquals(-10, result);
        
        assertTrue(50 > result); 
 
        assertFalse(0 < result); 
 
        assertNull(null); 

        assertNotNull(calculator);
    }
    @Test
    public void testProduct() {
        Calculator calculator = new Calculator();

        int result = calculator.product(10, 20);

        assertEquals(200, result);
        
        assertTrue(500 > result); 
 
        assertFalse(500 < result); 
 
        assertNull(null); 

        assertNotNull(calculator);
    }
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();

        int result = calculator.division(10, 5);

        assertEquals(2, result);
        
        assertTrue(50 > result); 
 
        assertFalse(50 < result); 
 
        assertNull(null); 

        assertNotNull(calculator);
    }
}