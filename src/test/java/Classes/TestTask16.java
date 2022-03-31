package Classes;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestTask16 {
    @Test

    public void testFighter(){
        assertEquals("Fighter1", Task16.declareWinner(
                new Task16.Fighter("Fighter1", 10,2),
                new Task16.Fighter("Fighter2", 5,4),
                "Fighter1"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter
                ("Harald", 20, 5), new Task16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Task16.declareWinner
                (new Task16.Fighter("Harald", 20, 5), new Task16.Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Task16.declareWinner
                (new Task16.Fighter("Jerry", 30, 3), new Task16.Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Task16.declareWinner
                (new Task16.Fighter("Jerry", 30, 3), new Task16.Fighter("Harald", 20, 5), "Harald"));
    }
}
