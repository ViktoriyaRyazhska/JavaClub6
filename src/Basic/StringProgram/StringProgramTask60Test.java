package StringProgram;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringProgramTask60Test {
    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("a\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask60.findThePosition(), is("Position of alphabet: 1"));

        System.setIn(sysInBackup);
    }

    @Test
    public void test2() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("z\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask60.findThePosition(), is("Position of alphabet: 26"));

        System.setIn(sysInBackup);
    }

    @Test
    public void test3() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("e\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask60.findThePosition(), is("Position of alphabet: 5"));

        System.setIn(sysInBackup);
    }
}
