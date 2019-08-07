import dojo.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {

    @Test
    public void testSum() {
        assertEquals(5, Calc.add(3,2), "Yo espero que retorne 5)");
    }
}
