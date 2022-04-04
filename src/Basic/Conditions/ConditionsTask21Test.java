package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConditionsTask21Test {
    @Test public void testTrue(){
        assertEquals(ConditionsTask21.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(ConditionsTask21.convert(false), "false");
    }

}