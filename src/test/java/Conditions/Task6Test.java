package Conditions;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task6Test {
    @Test
    public void testPlayer1Win() {
        assertEquals("Player 1 won!", Task6.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Task6.rps("scissors", "paper"));
        assertTrue(("Player 1 won!").equals(Task6.rps("paper", "rock")));
    }
    @Test
    public void testPlayer2Win() {
        assertEquals("Player 2 won!", Task6.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Task6.rps("paper", "scissors"));
        assertFalse(("Player 1 won!").equals(Task6.rps("rock", "paper")));
    }
    @Test
    public void testDraw() {
        assertEquals("Draw!", Task6.rps("scissors", "scissors"));
        assertEquals("Draw!", Task6.rps("paper", "paper"));
        assertEquals("Draw!", Task6.rps("rock", "rock"));
    }
}
