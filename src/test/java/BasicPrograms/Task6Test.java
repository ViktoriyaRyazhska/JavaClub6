package BasicPrograms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @ParameterizedTest
    @ValueSource(ints = {65, 7, 89, 6, 4, 56, 78, -3})
    public void testToBinaryMethodFromTask6(int number){
        System.out.println(Task6.toBinary(number));
        assertTrue(1000001==Task6.toBinary(65));
    }

}