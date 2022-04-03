package StringProgram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class StringProgramTask64Test {

    @Test
    void abbrevName() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Ivanna Fryshchyn".getBytes());
        System.setIn(in);

        assertEquals("I.F", StringProgramTask64.abbrevName());

        System.setIn(sysInBackup);
    }
}