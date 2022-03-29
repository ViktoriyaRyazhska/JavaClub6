package Conditions;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class TestTask31 {
    @Test
    public void under3Tests() {
        assertEquals(40, Task31.rentalCarCost(1));
        assertEquals(80, Task31.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, Task31.rentalCarCost(3));
        assertEquals(140, Task31.rentalCarCost(4));
        assertEquals(180, Task31.rentalCarCost(5));
        assertEquals(220, Task31.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, Task31.rentalCarCost(7));
        assertEquals(270, Task31.rentalCarCost(8));
        assertEquals(310, Task31.rentalCarCost(9));
        assertEquals(350, Task31.rentalCarCost(10));
    }
}
