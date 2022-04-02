package Loops;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoopsTask40Test {
    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("3\n1\n2\n3\n".getBytes());
        System.setIn(in);

        assertThat(LoopsTask40.ReduceButGrow(), is(6));

        System.setIn(sysInBackup);
    }

    @Test
    public void test2() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("5\n4\n1\n1\n1\n4\n".getBytes());
        System.setIn(in);

        assertThat(LoopsTask40.ReduceButGrow(), is(16));

        System.setIn(sysInBackup);
    }
}
