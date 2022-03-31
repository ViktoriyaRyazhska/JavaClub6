package Loops;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestTask36 {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Task36().countSheeps(array1));
    }
}
