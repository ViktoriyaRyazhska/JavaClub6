package test.OOP;

import main.OOP.Task1.Leetspeak;
import org.junit.Test;

import java.beans.Encoder;

import static org.junit.Assert.*;

public class Task3Test {

    Leetspeak encoder = new Leetspeak();

    @Test
    public void testEncoderNotNull(){
        Encoder myEncoder = null;
        try {
            myEncoder = new Leetspeak();
        } catch(Exception e) {
            fail("Could not initialize the encoder properly");
        }
        assertNotNull("Encoder is null", myEncoder);
    }

    @Test
    public void testReturnEmptyStringWhenNull() {
        assertEquals("", encoder.encode(null));
    }

    @Test
    public void testReturnEmptyStringWhenEmpty() {
        assertEquals("", encoder.encode(""));
    }

    @Test
    public void testLeetspeak() {
        assertEquals("133tsp34k", encoder.encode("Leetspeak"));
    }

    @Test
    public void testEncodeUpperCase(){
        assertEquals("4BCD3", encoder.encode("ABCDE"));
    }

    @Test
    public void testSimpleEncoding(){
        assertEquals("si/^^\\p13 3nc0ding", encoder.encode("simple encoding"));
    }

    @Test
    public void testMixedCaseEncoding(){
        assertEquals("4bcD3FghI", encoder.encode("abcDEFghI"));
    }

    @Test
    public void testSpecialSymbols(){
        assertEquals("^/^^\\(_)/^^\\0/^^\\", encoder.encode("^mumom"));
    }

    @Test
    public void testComplexEncoding(){
        assertEquals("109Z(_)I^4bcD", encoder.encode("109ZUI^abcD"));
    }
}
