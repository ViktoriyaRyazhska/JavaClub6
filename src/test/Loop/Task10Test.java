package test.Loop;

import org.junit.Test;

import static main.Loop.Task10.ReArrangeArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task10Test {
        @Test
        public void exampleTest1() {
            assertArrayEquals(new String[]{ "head", "body", "tail" },
                    ReArrangeArray(new String[]{ "tail", "body", "head" }));
        }

        @Test
        public void exampleTest2() {
            assertArrayEquals(new String[]{ "heads", "body", "tails" },
                    ReArrangeArray(new String[]{ "tails", "body", "heads" }));
        }


        @Test
        public void exampleTest3() {
            assertArrayEquals(new String[]{ "top", "middle", "bottom" },
                    ReArrangeArray(new String[]{ "bottom", "middle", "top" }));
        }

        @Test
        public void exampleTest4() {
            assertArrayEquals(new String[]{ "upper legs", "torso", "lower legs" },
                    ReArrangeArray(new String[]{ "lower legs", "torso", "upper legs" }));
        }

        @Test
        public void exampleTest5() {
            assertArrayEquals(new String[]{ "sky", "rainbow", "ground" },
                    ReArrangeArray(new String[]{ "ground", "rainbow", "sky" }));
        }
}
