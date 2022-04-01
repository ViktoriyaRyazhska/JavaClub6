package test.Collections;

import main.Collections.Task1;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task1Test {
    @Test
    public void testSomething() {
        List<String> items = Task1.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }
}
