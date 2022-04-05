package Conditions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
class ConditionsTask32Test {

    @Test
    void over7Tests() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
        System.setIn(in);
        assertThat(ConditionsTask32.rentalCarCost(), is(230));

        System.setIn(sysInBackup);;
    }
    @Test
    void over3Tests() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        assertThat(ConditionsTask32.rentalCarCost(), is(140));
        System.setIn(sysInBackup);
    }
}