package Basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask5 {
    @Test
    public void examples() {
        // assertEquals("expected", "actual");

        assertEquals("Hello, my love!", Task5.greet("Johnny"));
        assertEquals("Hello, Joh", Task5.greet("Joh"));
        assertEquals("Hello, H", Task5.greet("H"));

    }
}