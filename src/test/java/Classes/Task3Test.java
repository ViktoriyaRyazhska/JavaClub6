package Classes;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {
    @Test
    public void T1_Tests() {

        Assert.assertEquals(new Task3(37, 40), new Task3(1, 8).add(new Task3(4, 5)));
        Assert.assertEquals(new Task3(1, 1), new Task3(1, 4).add(new Task3(3, 4)));
        Assert.assertEquals(new Task3(863483, 416760), new Task3(911, 920).add(new Task3(980, 906)));
        Assert.assertEquals(new Task3(838923, 926885), new Task3(610, 941).add(new Task3(253, 985)));
        Assert.assertEquals(new Task3(16880, 3591), new Task3(956, 798).add(new Task3(662, 189)));
        Assert.assertEquals(new Task3(1011239, 417585), new Task3(694, 485).add(new Task3(853, 861)));
        Assert.assertEquals(new Task3(191737, 20757), new Task3(982, 111).add(new Task3(219, 561)));
        Assert.assertEquals(new Task3(41201, 23571), new Task3(344, 873).add(new Task3(658, 486)));
        Assert.assertEquals(new Task3(184563, 68951), new Task3(662, 361).add(new Task3(322, 382)));
        Assert.assertEquals(new Task3(33926, 23577), new Task3(740, 813).add(new Task3(184, 348)));
        Assert.assertEquals(new Task3(78524, 39543), new Task3(579, 441).add(new Task3(543, 807)));
        Assert.assertEquals(new Task3(83997, 283910), new Task3(212, 979).add(new Task3(46, 580)));
    }

    @Test
    public void T2_Tests() {

        Assert.assertEquals(new Task3(1, 2), new Task3(4, 8));
        Assert.assertEquals(new Task3(2, 3), new Task3(10, 15));
        Assert.assertEquals(new Task3(4, 9), new Task3(24, 54));
    }

    @Test
    public void T3_Tests() {

        Assert.assertEquals("4/5", (new Task3(2, 5).add(new Task3(2, 5))).toString());
        Assert.assertEquals("5/6", (new Task3(2, 4).add(new Task3(1, 3))).toString());
        Assert.assertEquals("13/15", (new Task3(1, 5).add(new Task3(4, 6))).toString());
    }
}
