package Classes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Task5Test {
    @Test
    void testDeclareWinner() {
        assertEquals("Lew", Task5.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Task5.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Task5.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
    }

    @Test
    void testDeclareWinner1() {
        Fighter fighter = new Fighter("Name1", 1, 1);
        Fighter fighter1 = new Fighter("Name2", 1, 0);

        assertEquals("Name1", Task5.declareWinner(fighter, fighter1, "Name2"));
        assertEquals(1, fighter.health);
        assertEquals(0, fighter1.health);
    }

}