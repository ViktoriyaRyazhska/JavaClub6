package Conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.EmptySource;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    @Test
    @EmptySource
    public void testIfUpdateLightMethodWorks(){
        assertEquals(Task13.updateLight("green"),"yellow");
        assertEquals(Task13.updateLight("yellow"),"red");
        assertEquals(Task13.updateLight("red"),"green");
    }


}