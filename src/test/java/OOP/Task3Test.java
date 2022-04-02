package OOP;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class Task3Test {
    task3 myEncoder = new task3();

    @Test
    public void simpleTest(){
        assertTrue("empty string", myEncoder.encode("").equals(""));
        assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
    }
}
