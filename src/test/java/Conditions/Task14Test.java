package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task14Test {
    @Test
    public void underThreeDaysTests() {
        assertEquals(40, Task14.rentalCarCost(1));
        assertEquals(80, Task14.rentalCarCost(2));
    }

    @Test
    public void underSevenDaysTests() {
        assertEquals(100, Task14.rentalCarCost(3));
        assertEquals(140, Task14.rentalCarCost(4));
        assertEquals(180, Task14.rentalCarCost(5));
        assertEquals(220, Task14.rentalCarCost(6));
    }

    @Test
    public void SevenOrOverDaysTests() {
        assertEquals(230, Task14.rentalCarCost(7));
        assertEquals(270, Task14.rentalCarCost(8));
        assertEquals(310, Task14.rentalCarCost(9));
        assertEquals(350, Task14.rentalCarCost(10));
    }
}
