package OOP;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task1Test {
    @Test
    public void testMakingAdam() {
        Human[] paradise = Task1.create();
        assertEquals("Adam is a man", true, paradise[0] instanceof Man);
    }

    @Test
    public void testMakingEva() {
        Human[] paradise = Task1.create();
        assertEquals("Eva is a woman", true, paradise[1] instanceof Woman);
    }
}
