package Loops;

import Conditions.ConditionsTask20;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class LoopsTask44Test {

    @Test
    void findNearestSquare() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
        System.setIn(in);

        assertEquals(9, LoopsTask44.findNearestSquare());

        System.setIn(sysInBackup);

    }
}