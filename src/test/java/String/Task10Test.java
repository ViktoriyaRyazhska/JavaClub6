package String;
/**     Task 10
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    public void testFakeBin() {
        assertEquals("000",Task10.fakeBin("123"));
        assertEquals("11001101",Task10.fakeBin("66217839"));
        assertEquals("000",Task10.fakeBin("000"));
        assertEquals("01010101010101",Task10.fakeBin("06172839483726"));


    }
}