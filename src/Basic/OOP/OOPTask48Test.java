package OOP;

import org.junit.Test;

import static org.junit.Assert.*;

public class OOPTask48Test {
    @Test
    public void makingAdam(){
        Human[] paradise = OOPTask48.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}