import org.junit.jupiter.api.Test;
import session3.calc.CalcPrimitive;

import static org.junit.jupiter.api.Assertions.*;

public class CalcPrimitiveTest {
    @Test
    public void testAdd() {
        assertEquals(6, CalcPrimitive.add(2,4));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, CalcPrimitive.subtract(7,4));
        assertEquals(-3, CalcPrimitive.subtract(4,7));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, CalcPrimitive.multiply(2,5));
    }

    @Test
    public void testDivide() {
        assertEquals(10, CalcPrimitive.divide(20,2));
        assertEquals(2, CalcPrimitive.divide(10, 4));
    }

    @Test
    public void testModulus() {
        assertEquals(0, CalcPrimitive.modulus(15, 3));
        assertEquals(2, CalcPrimitive.modulus(10, 4));
    }

}
