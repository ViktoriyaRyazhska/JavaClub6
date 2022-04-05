package Conditions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ConditionsTask27Test {

    @Test
    void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("true".getBytes());
        System.setIn(in);

        Assertions.assertEquals("Yes", ConditionsTask27.boolToWord());

        System.setIn(sysInBackup);
    }
    @Test
    void test2() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("false".getBytes());
        System.setIn(in);

        Assertions.assertEquals("No", ConditionsTask27.boolToWord());

        System.setIn(sysInBackup);
    }
}