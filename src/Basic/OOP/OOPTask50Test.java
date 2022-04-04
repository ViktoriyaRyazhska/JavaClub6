package OOP;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OOPTask50Test {

    OOPTask50.Leetspeak myEncoder = new OOPTask50.Leetspeak();

    @Test
    public void simpleTest(){
        assertTrue("empty string", myEncoder.encode("").equals(""));
        assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
    }

}