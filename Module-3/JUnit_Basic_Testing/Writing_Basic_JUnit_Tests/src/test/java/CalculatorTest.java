import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();

        int result = calculator.sub(10, 20);

        assertEquals(-10, result);
    }
    @Test
    public void testProduct() {
        Calculator calculator = new Calculator();

        int result = calculator.product(10, 20);

        assertEquals(200, result);
    }
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();

        int result = calculator.division(10, 5);

        assertEquals(2, result);
    }
}