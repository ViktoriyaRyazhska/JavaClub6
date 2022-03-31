package Basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task7Test {
    @Test
    public void testPast(){
        assertEquals(61000, Task7.past(0,1,1));
        assertEquals(0, Task7.past(0,0,0));
        assertEquals(3661000, Task7.past(1,1,1));
        assertEquals(62000, Task7.past(0,1,2));
    }
}
