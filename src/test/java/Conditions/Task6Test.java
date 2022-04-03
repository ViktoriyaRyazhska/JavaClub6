package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    public void firstTest(){
        assertEquals("Player 1 won!", Task6.rps("paper", "rock"));
    }
    @Test
    public void secondTest(){
        assertEquals("Player 1 won!", Task6.rps("scissors", "paper"));
    }
    @Test
    public void thirdTest(){
        assertEquals("Player 2 won!", Task6.rps("scissors", "rock"));
    }
    @Test
    public void fourthTest(){
        assertEquals("Player 2 won!", Task6.rps("rock", "paper"));
    }
    @Test
    public void fifthTest(){
        assertEquals("Draw!", Task6.rps("rock", "rock"));
    }
}