package Loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task5Test {
    @Test
    void testCountSheeps() {
        assertEquals(1, (new Task5()).countSheeps(new Boolean[]{true}));
        assertEquals(0, (new Task5()).countSheeps(new Boolean[]{false}));
    }
}

