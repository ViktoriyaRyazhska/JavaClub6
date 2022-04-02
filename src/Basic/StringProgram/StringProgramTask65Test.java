package StringProgram;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringProgramTask65Test {
    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Hello\no\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask65.strCount(), is(1));

        System.setIn(sysInBackup);
    }

    @Test
    public void test2() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Hello\nl\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask65.strCount(), is(2));

        System.setIn(sysInBackup);
    }

    @Test
    public void test3() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("\nz\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask65.strCount(), is(0));

        System.setIn(sysInBackup);
    }
}
