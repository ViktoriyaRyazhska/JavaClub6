package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task10Test {
    Task10 WrongEndHead = new Task10();
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{ "head", "body", "tail" },
                WrongEndHead.sortEl(new String[]{ "tail", "body", "head" }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{ "heads", "body", "tails" },
                WrongEndHead.sortEl(new String[]{ "tails", "body", "heads" }));
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{ "top", "middle", "bottom" },
                WrongEndHead.sortEl(new String[]{ "bottom", "middle", "top" }));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{ "upper legs", "torso", "lower legs" },
                WrongEndHead.sortEl(new String[]{ "lower legs", "torso", "upper legs" }));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{ "sky", "rainbow", "ground" },
                WrongEndHead.sortEl(new String[]{ "ground", "rainbow", "sky" }));
    }
}
