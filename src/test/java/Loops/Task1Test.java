package Loops;
/**     Task 1
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
   public void testRepeatStr() {
        assertEquals("ttttt", Task1.repeatStr(5,"t"));
        assertEquals("ЗСУЗСУЗСУЗСУЗСУЗСУ", Task1.repeatStr(6,"ЗСУ"));

    }
}