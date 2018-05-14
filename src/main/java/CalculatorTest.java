import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(20, 5);
    }

    @Test
    public void addNums(){
        assertEquals(25, calculator.addNums());
    }

    @Test
    public void subtractNums(){
        assertEquals(15, calculator.subtractNums());
    }

    @Test
    public void multiplyNums(){
        assertEquals(100, calculator.multiplyNums());
    }

    @Test
    public void divideNums(){
        assertEquals(4, calculator.divideNums());
    }
}
