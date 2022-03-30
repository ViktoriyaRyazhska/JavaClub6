package Collections;

import org.junit.Test;
import java.util.List;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestTask69 {
    @Test
    public void testSomething() {
        List<String> items = Task69.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }

}