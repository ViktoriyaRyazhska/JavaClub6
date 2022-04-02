package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTask16Test {

    @Test
    public void basicTests() {
        assertEquals("Lew", ClassTask16.declareWinner(new ClassTask16.Fighter("Lew", 10, 2), new ClassTask16.Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", ClassTask16.declareWinner(new ClassTask16.Fighter("Lew", 10, 2), new ClassTask16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", ClassTask16.declareWinner(new ClassTask16.Fighter("Harald", 20, 5), new ClassTask16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", ClassTask16.declareWinner(new ClassTask16.Fighter("Harald", 20, 5), new ClassTask16.Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", ClassTask16.declareWinner(new ClassTask16.Fighter("Jerry", 30, 3), new ClassTask16.Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", ClassTask16.declareWinner(new ClassTask16.Fighter("Jerry", 30, 3), new ClassTask16.Fighter("Harald", 20, 5), "Harald"));
    }
}