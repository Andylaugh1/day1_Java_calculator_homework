import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20,10);
    }

    @Test
    public void print(){
        assertEquals(14, printer.print(3, 2));
    }

    @Test
    public void refill(){
        assertEquals(20, printer.refill());
    }

    @Test
    public void reduceToner(){
        assertEquals(7, printer.reduceToner(3));
    }
}

