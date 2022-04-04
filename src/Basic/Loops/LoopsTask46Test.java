package Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LoopsTask46Test {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(LoopsTask46.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(LoopsTask46.gap(4,100,110)));
        assertEquals(null, LoopsTask46.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(LoopsTask46.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(LoopsTask46.gap(10,300,400)));
    }

}