package Loops;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoopsTask45Test {
    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1\n1\n".getBytes());
        System.setIn(in);

        assertThat(LoopsTask45.getAverage(), is(1));

        System.setIn(sysInBackup);
    }

    @Test
    public void test2() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("8\n1\n2\n3\n4\n5\n6\n7\n8\n".getBytes());
        System.setIn(in);

        assertThat(LoopsTask45.getAverage(), is(4));

        System.setIn(sysInBackup);
    }
}
