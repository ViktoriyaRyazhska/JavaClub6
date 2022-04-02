package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task12Test {
    Task12 Solution = new Task12();
    @Test
    public void testSomething() {
        assertEquals(2, Solution.sequence(20));
        assertEquals(2, Solution.sequence(148));
        assertEquals(2, Solution.sequence(111));
        assertEquals(2, Solution.sequence(118));
        assertEquals(0, Solution.sequence(41));
        assertEquals(0, Solution.sequence(85));
        assertEquals(0, Solution.sequence(117));
        assertEquals(1, Solution.sequence(82));
        assertEquals(1, Solution.sequence(72));
        assertEquals(1, Solution.sequence(5101394));
        assertEquals(1, Solution.sequence(163));
        assertEquals(1, Solution.sequence(90));
    }
}
