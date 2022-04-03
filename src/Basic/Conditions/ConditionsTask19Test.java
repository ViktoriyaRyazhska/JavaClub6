package Conditions;

import StringProgram.StringProgramTask55;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ConditionsTask19Test {

    @Test
    void opposite() {
            InputStream sysInBackup = System.in;
            ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());
            System.setIn(in);
            assertThat(ConditionsTask19.opposite(),is(-1));
            System.setIn(sysInBackup);
        }
    }
