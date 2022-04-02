package Opp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask47 {
    @Test
    public void testMakingAdam() {
        Human[] paradise = Task47.create();
        assertEquals("Adam is a man", true, paradise[0] instanceof Man);
    }

    @Test
    public void testMakingEva() {
        Human[] paradise = Task47.create();
        assertEquals("Eva is a woman", true, paradise[1] instanceof Woman);
    }
}