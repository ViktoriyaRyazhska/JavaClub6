package OOP;
/**     Task 3
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void test1Encode() {
        Task3 task3 = new Task3();
        assertEquals("f4rk", task3.encode("fark"));
        assertEquals("/^^\\341", task3.encode("meal"));
        assertEquals("", task3.encode(""));

    }

}