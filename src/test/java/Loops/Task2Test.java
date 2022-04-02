package Loops;
/**     Task 2
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

        @Test
        public void one() {
            assertArrayEquals(new int[]{1,15,15}, Task2.humanYearsCatYearsDogYears(1));
        }

        @Test
        public void two() {
            assertArrayEquals(new int[]{2,24,24}, Task2.humanYearsCatYearsDogYears(2));
        }

        @Test
        public void ten() {
            assertArrayEquals(new int[]{10,56,64}, Task2.humanYearsCatYearsDogYears(10));
        }
    }
