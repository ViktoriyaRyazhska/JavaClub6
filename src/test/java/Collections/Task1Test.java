package Collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task1Test {
    @Test
    public void testSomething() {
        List<String> items = task1.added();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }
}
