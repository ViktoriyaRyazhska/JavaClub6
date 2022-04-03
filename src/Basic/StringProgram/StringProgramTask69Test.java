package StringProgram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class StringProgramTask69Test {

    @Test
    void remove() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("!!!Hi !!hi!!! !hi\n3".getBytes());
        System.setIn(in);

        assertEquals("Hi !!hi!!! !hi", StringProgramTask69.remove());

        System.setIn(sysInBackup);
    }
}