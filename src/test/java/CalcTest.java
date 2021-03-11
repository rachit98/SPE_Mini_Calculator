import calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    private static final double DELTA = 1e-15;
    Calculator cal = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root of number for True Positive", 3.0, cal.square_Root(9), DELTA);
        assertEquals("Square Root of number for True Positive", 4.0, cal.square_Root(16), DELTA);
        assertEquals("Square Root of number for True Positive", Double.NaN, cal.square_Root(-10), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of number for False Positive", 4.0, cal.square_Root(18), DELTA);
        assertNotEquals("Square Root of number for False Positive", 5.0, cal.square_Root(32), DELTA);
        assertNotEquals("Square Root of number for False Positive", 5.0, cal.square_Root(-16), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True positive", 6.0,cal.fact(3), DELTA);
        assertEquals("Factorial of number for True positive", 120.0,cal.fact(5), DELTA);
        assertEquals("Factorial of number for True positive", Double.NaN,cal.fact(-1), DELTA);
        assertEquals("Factorial of number for True positive", Double.NaN,cal.fact(2.5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 8.0,cal.fact(3), DELTA);
        assertNotEquals("Factorial of number for False positive", 60.0,cal.fact(5), DELTA);
        assertNotEquals("Factorial of number for False positive", 60.0,cal.fact(-5), DELTA);


    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Factorial of number for True positive", 2.833213344056216,cal.natural_Log(17), DELTA);
        assertEquals("Factorial of number for True positive", 1.791759469228055,cal.natural_Log(6), DELTA);
        assertEquals("Factorial of number for True positive", Double.NaN, cal.natural_Log(0), DELTA);
    }

    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 2.833213344056216,cal.natural_Log(14), DELTA);
        assertNotEquals("Factorial of number for False positive", 1.791759469228055,cal.natural_Log(9), DELTA);
        assertNotEquals("Factorial of number for False positive", 0, cal.natural_Log(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Factorial of number for True positive", 4.0,cal.power(2, 2), DELTA);
        assertEquals("Factorial of number for True positive", 27.0,cal.power(3,3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 4.0,cal.power(2, 3), DELTA);
        assertNotEquals("Factorial of number for False positive", 5.0,cal.power(3,3), DELTA);
    }

}
