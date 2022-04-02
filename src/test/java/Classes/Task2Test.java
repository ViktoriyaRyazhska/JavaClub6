package Classes;

import org.junit.jupiter.api.Test;

public class Task2Test {
    task2 Dinglemouse = new task2();

    @Test
    public void test() {
        System.out.println(Dinglemouse.INST.plus100(23));
    }
}
