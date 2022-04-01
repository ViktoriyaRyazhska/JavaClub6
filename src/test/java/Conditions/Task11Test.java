package Conditions;
/**     Task 11
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {
    @Test
    public void testSequence(){
        assertEquals(2, Task11.sequence(111));
        assertEquals(1, Task11.sequence(72));
        assertEquals(1, Task11.sequence(5101394));
        assertEquals(1, Task11.sequence(163));
        assertEquals(1, Task11.sequence(90));
    }

}