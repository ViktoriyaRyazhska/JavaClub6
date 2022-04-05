package Classes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ClassTask14Test {

    @Test
    public void T1_GeneralTests() {

        Assert.assertEquals(new ClassTask14(37, 40), new ClassTask14(1, 8).add(new ClassTask14(4, 5)));
        Assert.assertEquals(new ClassTask14(1, 1), new ClassTask14(1, 4).add(new ClassTask14(3, 4)));
        Assert.assertEquals(new ClassTask14(863483, 416760), new ClassTask14(911, 920).add(new ClassTask14(980, 906)));
        Assert.assertEquals(new ClassTask14(838923, 926885), new ClassTask14(610, 941).add(new ClassTask14(253, 985)));
        Assert.assertEquals(new ClassTask14(16880, 3591), new ClassTask14(956, 798).add(new ClassTask14(662, 189)));
        Assert.assertEquals(new ClassTask14(1011239, 417585), new ClassTask14(694, 485).add(new ClassTask14(853, 861)));
        Assert.assertEquals(new ClassTask14(191737, 20757), new ClassTask14(982, 111).add(new ClassTask14(219, 561)));
        Assert.assertEquals(new ClassTask14(41201, 23571), new ClassTask14(344, 873).add(new ClassTask14(658, 486)));
        Assert.assertEquals(new ClassTask14(184563, 68951), new ClassTask14(662, 361).add(new ClassTask14(322, 382)));
        Assert.assertEquals(new ClassTask14(33926, 23577), new ClassTask14(740, 813).add(new ClassTask14(184, 348)));
        Assert.assertEquals(new ClassTask14(78524, 39543), new ClassTask14(579, 441).add(new ClassTask14(543, 807)));
        Assert.assertEquals(new ClassTask14(83997, 283910), new ClassTask14(212, 979).add(new ClassTask14(46, 580)));
    }

    @Test
    public void T2_ReductionTests() {

        Assert.assertEquals(new ClassTask14(1, 2), new ClassTask14(4, 8));
        Assert.assertEquals(new ClassTask14(2, 3), new ClassTask14(10, 15));
        Assert.assertEquals(new ClassTask14(4, 9), new ClassTask14(24, 54));
    }

    @Test
    public void T3_ToStringTests() {

        Assert.assertEquals("4/5", (new ClassTask14(2, 5).add(new ClassTask14(2, 5))).toString());
        Assert.assertEquals("5/6", (new ClassTask14(2, 4).add(new ClassTask14(1, 3))).toString());
        Assert.assertEquals("13/15", (new ClassTask14(1, 5).add(new ClassTask14(4, 6))).toString());
    }
}