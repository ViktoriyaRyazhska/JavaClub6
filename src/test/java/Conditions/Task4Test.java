package Conditions;

import BasicPrograms.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    public void firstTest(){
        assertEquals("£20",Task4.bonusTime(2, true));
    }
    @Test
    public void secondTest(){
        assertEquals("£60000",Task4.bonusTime(60000, false));
    }
    @Test
    public void thirdTest(){
        assertEquals("£250000",Task4.bonusTime(25000, true));
    }
    @Test
    public void fourthTest(){
        assertEquals("£79",Task4.bonusTime(79, false));
    }
    @Test
    public void fifthTest(){
        assertEquals("£678900",Task4.bonusTime(67890, true));
    }
}