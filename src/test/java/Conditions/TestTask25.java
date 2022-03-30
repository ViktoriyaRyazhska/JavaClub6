package Conditions;

import Conditions.Task25;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask25 {

    Task25 testTask25 = new Task25();

    @Test
    public void testOddAndEven() {
        assertEquals(true, testTask25.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, testTask25.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, testTask25.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, testTask25.isLove(0, 1));
    }

}