package Collections;

import StringProgram.StringProgramTask65;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class CollectionsTask70Test {
    @Test
    public void test1() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("".getBytes());
        System.setIn(in);

        List<String> items = CollectionsTask70.push();
        assertEquals(1,items.size());

        assertThat(items.get(0), is("an object"));

        System.setIn(sysInBackup);
    }
}
