package Conditions;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ConditionsTask25Test {
    @Test
    public void test1()
    {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("+\n4\n7\n".getBytes());
        System.setIn(in);

        assertThat(ConditionsTask25.basicOperations(), is(11));

        System.setIn(sysInBackup);
    }

    @Test
    public void test2()
    {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("-\n15\n18\n".getBytes());
        System.setIn(in);

        assertThat(ConditionsTask25.basicOperations(), is(-3));

        System.setIn(sysInBackup);
    }

    @Test
    public void test3()
    {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("*\n5\n5\n".getBytes());
        System.setIn(in);

        assertThat(ConditionsTask25.basicOperations(), is(25));

        System.setIn(sysInBackup);
    }

    @Test
    public void test4()
    {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("/\n49\n7\n".getBytes());
        System.setIn(in);

        assertThat(ConditionsTask25.basicOperations(), is(7));

        System.setIn(sysInBackup);
    }
}
