package StringProgram;

import Loops.LoopsTask44;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class StringProgramTask54Test {

    @Test
    void sayHello() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Iva\nLviv\nUkraine".getBytes());
        System.setIn(in);

        assertEquals("Hello, Iva ! Welcome to Lviv, Ukraine!", StringProgramTask54.sayHello());

        System.setIn(sysInBackup);
    }
}