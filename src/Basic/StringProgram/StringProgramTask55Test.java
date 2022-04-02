package StringProgram;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringProgramTask55Test {
    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(in);

        assertThat(StringProgramTask55.oppositeNum(), is(-1));

        System.setIn(sysInBackup);
    }
}
