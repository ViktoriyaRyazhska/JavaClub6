package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void firstTest(){
        assertEquals("word", Task2.solution("drow"));
    }
    @Test
    public void secondTest(){
        assertEquals("drow", Task2.solution("word"));
    }
    @Test
    public void thirdTest(){
        assertEquals("wan", Task2.solution("naw"));
    }
    @Test
    public void fourthTest(){
        assertEquals("", Task2.solution(""));
    }
    @Test
    public void fifthTest(){
        assertEquals("20", Task2.solution("02"));
    }
}