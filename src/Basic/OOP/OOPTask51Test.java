package OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class OOPTask51Test {
    private OOPTask51.Calculator sut = new OOPTask51.Calculator();

    @Test
    public void areaOfATriangleIsBaseMultipliedByHeight() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("6\n4".getBytes());
        System.setIn(in);
        Assertions.assertEquals(12, new Triangle().calculateArea());
        System.setIn(sysInBackup);
    }

    @Test
    public void areaOfASquareIsSquareOfSide() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
        System.setIn(in);
        Assertions.assertEquals(36, new Square().calculateArea());
        System.setIn(sysInBackup);
    }

    @Test
    public void areaOfARectangleIsWidthMultipliedByHeight() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("4\n8".getBytes());
        System.setIn(in);
        Assertions.assertEquals(32, new Rectangle().calculateArea());
        System.setIn(sysInBackup);
    }

    @Test
    public void areaOfACircleIsSquareOfRadiusMulitpliedByPi() {
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        Assertions.assertEquals(28.26, new Circle().calculateArea());
        System.setIn(sysInBackup);
    }
}