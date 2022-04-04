package OOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void Example_Tests() throws Exception
    {
        assertEquals( true, Dih4.ROTATE_180.is_rotation() );
        assertEquals( true, Dih4.REFLECT_VERTICAL.is_reflection() );

        assert_Dih4_equal( Dih4.ROTATE_90_ANTICLOCKWISE, Dih4.ROTATE_90_CLOCKWISE.inv() );
        assert_Dih4_equal( Dih4.REFLECT_REVERSE_DIAGONAL, Dih4.ROTATE_90_CLOCKWISE.then(Dih4.REFLECT_VERTICAL) );

        Dih4 r = Dih4.ROTATE_90_ANTICLOCKWISE;
        Dih4 f = Dih4.REFLECT_HORIZONTAL;
        assert_Dih4_equal( r.inv(), r.then(r).then(r) );
        assert_Dih4_equal( f.then(r), r.inv().then(f) );

        assertEquals( true, Dih4.ROTATE_90_CLOCKWISE.equals(Dih4.ROTATE_90_CLOCKWISE) );
        assertEquals( false, Dih4.ROTATE_90_CLOCKWISE.equals(Dih4.ROTATE_90_ANTICLOCKWISE) );
    }


    public static void assert_Dih4_equal(Dih4 expected, Dih4 actual)
    {
        assertEquals(Dih4_to_String(expected), Dih4_to_String(actual));
    }


    public static String Dih4_to_String(Dih4 r)
    {
        return r.equals(Dih4.IDENTITY)                 ? "identity transformation"
                : r.equals(Dih4.ROTATE_90_ANTICLOCKWISE)  ? "rotation 90 degrees anticlockwise"
                : r.equals(Dih4.ROTATE_180)               ? "rotation 180 degrees"
                : r.equals(Dih4.ROTATE_90_CLOCKWISE)      ? "rotation 90 degrees clockwise"
                : r.equals(Dih4.REFLECT_VERTICAL)         ? "reflection in vertical line"
                : r.equals(Dih4.REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : r.equals(Dih4.REFLECT_HORIZONTAL)       ? "reflection in horizontal line"
                : r.equals(Dih4.REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                :                                      "unknown Dih4 value";
    }

}