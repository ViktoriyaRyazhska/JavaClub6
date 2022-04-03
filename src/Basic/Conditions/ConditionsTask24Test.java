package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionsTask24Test {

        @Test
        public void test1() {
            System.out.println("Fixed Tests Player 1 won!");
            assertEquals("Player 1 won!", ConditionsTask24.rps("rock", "scissors"));
            assertEquals("Player 1 won!", ConditionsTask24.rps("scissors", "paper"));
            assertEquals("Player 1 won!", ConditionsTask24.rps("paper", "rock"));
        }
        @Test
        public void test2() {
            System.out.println("Fixed Tests Player 2 won!");
            assertEquals("Player 2 won!", ConditionsTask24.rps("scissors", "rock"));
            assertEquals("Player 2 won!", ConditionsTask24.rps("paper", "scissors"));
            assertEquals("Player 2 won!", ConditionsTask24.rps("rock", "paper"));
        }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", ConditionsTask24.rps("scissors", "scissors"));
        assertEquals("Draw!", ConditionsTask24.rps("paper", "paper"));
        assertEquals("Draw!", ConditionsTask24.rps("rock", "rock"));
    }
    }
