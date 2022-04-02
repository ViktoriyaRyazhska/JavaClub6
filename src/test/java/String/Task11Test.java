package String;
/**     Task 11
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    public void testHowOld() {
        assertEquals(1,Task11.howOld("1 years old"));
        assertEquals(-1,Task11.howOld("-957934759823751 years old"));
        assertEquals(5,Task11.howOld("5 years old"));
        assertEquals(9,Task11.howOld("9 years old"));

    }
}