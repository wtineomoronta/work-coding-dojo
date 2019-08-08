import org.junit.jupiter.api.Test;
import session3.calc.CalcWrapper;

import static org.junit.jupiter.api.Assertions.*;

public class CalcWrapperTest {
    @Test
    public void testAdd() {
        assertEquals(new Double(10), CalcWrapper.add(new Double(5), new Double(5)));
    }

    @Test
    public void testSubtract() {
        assertEquals(Double.valueOf(5), CalcWrapper.subract(Double.valueOf(8), Double.valueOf(3)));
        assertEquals(Double.valueOf(-5), CalcWrapper.subract(Double.valueOf(3), Double.valueOf(8)));
    }

    @Test
    public void testMultply() {
        assertEquals(Double.valueOf("15"), CalcWrapper.multiply(Double.valueOf("3"), Double.valueOf("5")));
    }

    @Test
    public void testDivide() {
        assertEquals(Double.valueOf(5), CalcWrapper.divide(Double.valueOf(15), Double.valueOf(3)));
        assertEquals(Double.valueOf(2.5), CalcWrapper.divide(Double.valueOf(10), Double.valueOf(4)));
    }

    @Test
    public void testModulus() {
        assertEquals(Double.valueOf(0), CalcWrapper.modulus(Double.valueOf(15), Double.valueOf(3)));
        assertEquals(Double.valueOf(2), CalcWrapper.modulus(Double.valueOf(10), Double.valueOf(4)));
    }
}
