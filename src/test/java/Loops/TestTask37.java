package Loops;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
public class TestTask37 {
    @Test
    public void testBasicBlock(){
        Assertions.assertArrayEquals(new int[]{2,1},Task37.reverse(2));
    }
}
