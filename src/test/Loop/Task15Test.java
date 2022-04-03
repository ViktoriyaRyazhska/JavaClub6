package test.Loop;

import org.junit.Test;

import static main.Loop.Task15.RobotWin;
import static org.junit.Assert.assertEquals;

public class Task15Test {
    @Test
    public void sampleTest() {
        assertEquals(3, RobotWin(3));
        assertEquals(3, RobotWin(7));
        assertEquals(1, RobotWin(5));
        assertEquals(2, RobotWin(6));
    }
}
