import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	Calculator calculator;
	
    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up test...");
        calculator = null;
    }
	

    @Test
    public void testAdd() {
    	
    	int a =10;
    	int b = 20;
    	
    	
        int result = calculator.add(10, 20);

        
        assertEquals(30, result); 
        assertTrue(result > 0); 
        assertFalse(result < 0); 
        assertNull(null); 
        assertNotNull(calculator);
        
    }
    @Test
    public void testSub() {
    	
    	int a = 10;
    	int b = 20;

    	
        int result = calculator.sub(a, b);

        assertEquals(-10, result);        
        assertTrue(50 > result);  
        assertFalse(0 < result); 
        assertNull(null); 
        assertNotNull(calculator);
    }
    @Test
    public void testProduct() {

    	int a = 10;
    	int b = 20;

    	
        int result = calculator.product(a, b);

        assertEquals(200, result);
        assertTrue(500 > result); 
        assertFalse(500 < result);  
        assertNull(null); 
        assertNotNull(calculator);
    }
    @Test
    public void testDivision() {

    	int a = 20;
    	int b = 10;

    	
        int result = calculator.division(a, b);


        assertEquals(2, result);        
        assertTrue(50 > result); 
        assertFalse(50 < result); 
        assertNull(null); 
        assertNotNull(calculator);
    }
}