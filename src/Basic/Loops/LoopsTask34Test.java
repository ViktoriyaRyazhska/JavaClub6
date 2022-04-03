package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTask34Test {

    @Test
    public void one() {

        assertArrayEquals(new int[]{1, 15, 15}, LoopsTask34.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2, 24, 24}, LoopsTask34.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10, 56, 64}, LoopsTask34.humanYearsCatYearsDogYears(10));
    }
}
