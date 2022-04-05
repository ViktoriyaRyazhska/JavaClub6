package Conditions;

import StringProgram.StringProgramTask59;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ConditionsTask22Test {

    @Test
    void bonusTime() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("100\ntrue".getBytes());
        System.setIn(in);

        assertEquals("\u00A3"+"1000", ConditionsTask22.bonusTime());

        System.setIn(sysInBackup);
    }
}