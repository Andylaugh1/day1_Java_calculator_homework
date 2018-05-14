import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(7, 8);
    }

    @Test
    public void addNums(){
        assertEquals(15, calculator.addNums());
    }

    @Test
    public void subtractNums(){
        assertEquals(-1, calculator.subtractNums());
    }
}
