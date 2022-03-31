package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task5Test {

    @Test
    public void tests() {
        assertEquals("You are 4 years old.", Task5.CalculateAge(2012, 2016));
        assertEquals("You are 27 years old.", Task5.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", Task5.CalculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", Task5.CalculateAge(2000, 1990));
        assertEquals("You were born this very year!", Task5.CalculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", Task5.CalculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", Task5.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", Task5.CalculateAge(2010, 1500));
        assertEquals("You are 1 year old.", Task5.CalculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", Task5.CalculateAge(2000, 1999));

    }
}
