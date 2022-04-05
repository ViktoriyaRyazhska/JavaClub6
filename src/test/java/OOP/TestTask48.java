package OOP;

import OOP.Task48.*;
import org.junit.Test;

import static OOP.Task48.*;
import static org.junit.Assert.assertEquals;

public class TestTask48 {


        @Test
        public void exampleTestTask48(){
            Task48 r = ROTATE_90_ANTICLOCKWISE;
            Task48 f = REFLECT_HORIZONTAL;
            assert_Dih4_equal( r.inv(), r.then(r).then(r) );
            assertEquals( true, ROTATE_180.is_rotation() );
            assertEquals( true, ROTATE_90_CLOCKWISE.equals(ROTATE_90_CLOCKWISE) );
        }
    public static void assert_Dih4_equal(Task48 expected, Task48 actual)
    {
        assertEquals(Dih4_to_String(expected), Dih4_to_String(actual));
    }
    public static String Dih4_to_String( Task48 r)
    {
        return r.equals(IDENTITY)                 ? "identity transformation"
                : r.equals(ROTATE_90_ANTICLOCKWISE)  ? "rotation 90 degrees anticlockwise"
                : r.equals(ROTATE_180)               ? "rotation 180 degrees"
                : r.equals(ROTATE_90_CLOCKWISE)      ? "rotation 90 degrees clockwise"
                : r.equals(REFLECT_VERTICAL)         ? "reflection in vertical line"
                : r.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : r.equals(REFLECT_HORIZONTAL)       ? "reflection in horizontal line"
                : r.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                :                                      "unknown Dih4 value";
    }
    }

