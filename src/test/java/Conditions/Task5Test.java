package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    public void firstTest(){
        assertEquals("You are 27 years old.", Task5.CalculateAge(1989, 2016));
    }
    @Test
    public void secondTest(){
        assertEquals("You will be born in 10 years.", Task5.CalculateAge(2000, 1990));
    }
    @Test
    public void thirdTest(){
        assertEquals("You were born this very year!", Task5.CalculateAge(3400, 3400));
    }
    @Test
    public void fourthTest(){
        assertEquals("You will be born in 510 years.", Task5.CalculateAge(2010, 1500));
    }
    @Test
    public void fifthTest(){
        assertEquals("You are 1 year old.", Task5.CalculateAge(2011, 2012));
    }
}