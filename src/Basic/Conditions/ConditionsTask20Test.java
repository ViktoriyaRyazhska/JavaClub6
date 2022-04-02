package Conditions;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ConditionsTask20Test {

    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("12\n4\n3\n".getBytes());
        System.setIn(in);

        assertEquals(true, ConditionsTask20.divisible());

        System.setIn(sysInBackup);
    }

    @Test
    public void test2() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("3\n3\n4\n".getBytes());
        System.setIn(in);

        assertEquals(false, ConditionsTask20.divisible());

        System.setIn(sysInBackup);
    }
}
