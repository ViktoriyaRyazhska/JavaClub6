package Basic;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertTrue;

public class Task4Test {

    @Test
    public void testIsDivisible() {
        assertThrows(ArithmeticException.class, () -> Task4.isDivisible(3, 0));
        assertTrue(Task4.isDivisible(1, 1));
        assertTrue(Task4.isDivisible(45612, 3));
        assertFalse(Task4.isDivisible(1, 34578));

    }
}
