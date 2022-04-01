package BasicPrograms;
/**     Task 5
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void testGreet() {
        assertEquals("Hello, my love!", Task5.greet("Johnny"));
        assertEquals("Hello, Kateryna!", Task5.greet("Kateryna"));
        assertEquals("Hello, Russki korabl!", Task5.greet("Russki korabl"));
    }
}