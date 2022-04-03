package StringProgram;

import Conditions.ConditionsTask20;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class StringProgramTask59Test {

    @Test
    void tripleTrouble() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("this\ntest\nlock\n".getBytes());
        System.setIn(in);

        assertEquals("ttlheoiscstk", StringProgramTask59.tripleTrouble());

        System.setIn(sysInBackup);
    }
}