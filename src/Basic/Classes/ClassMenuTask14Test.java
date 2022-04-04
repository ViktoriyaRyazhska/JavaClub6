package Classes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ClassMenuTask14Test {

    @Test
    public void T1_GeneralTests() {

        Assert.assertEquals(new ClassMenuTask14(37, 40), new ClassMenuTask14(1, 8).add(new ClassMenuTask14(4, 5)));
        Assert.assertEquals(new ClassMenuTask14(1, 1), new ClassMenuTask14(1, 4).add(new ClassMenuTask14(3, 4)));
        Assert.assertEquals(new ClassMenuTask14(863483, 416760), new ClassMenuTask14(911, 920).add(new ClassMenuTask14(980, 906)));
        Assert.assertEquals(new ClassMenuTask14(838923, 926885), new ClassMenuTask14(610, 941).add(new ClassMenuTask14(253, 985)));
        Assert.assertEquals(new ClassMenuTask14(16880, 3591), new ClassMenuTask14(956, 798).add(new ClassMenuTask14(662, 189)));
        Assert.assertEquals(new ClassMenuTask14(1011239, 417585), new ClassMenuTask14(694, 485).add(new ClassMenuTask14(853, 861)));
        Assert.assertEquals(new ClassMenuTask14(191737, 20757), new ClassMenuTask14(982, 111).add(new ClassMenuTask14(219, 561)));
        Assert.assertEquals(new ClassMenuTask14(41201, 23571), new ClassMenuTask14(344, 873).add(new ClassMenuTask14(658, 486)));
        Assert.assertEquals(new ClassMenuTask14(184563, 68951), new ClassMenuTask14(662, 361).add(new ClassMenuTask14(322, 382)));
        Assert.assertEquals(new ClassMenuTask14(33926, 23577), new ClassMenuTask14(740, 813).add(new ClassMenuTask14(184, 348)));
        Assert.assertEquals(new ClassMenuTask14(78524, 39543), new ClassMenuTask14(579, 441).add(new ClassMenuTask14(543, 807)));
        Assert.assertEquals(new ClassMenuTask14(83997, 283910), new ClassMenuTask14(212, 979).add(new ClassMenuTask14(46, 580)));
    }

    @Test
    public void T2_ReductionTests() {

        Assert.assertEquals(new ClassMenuTask14(1, 2), new ClassMenuTask14(4, 8));
        Assert.assertEquals(new ClassMenuTask14(2, 3), new ClassMenuTask14(10, 15));
        Assert.assertEquals(new ClassMenuTask14(4, 9), new ClassMenuTask14(24, 54));
    }

    @Test
    public void T3_ToStringTests() {

        Assert.assertEquals("4/5", (new ClassMenuTask14(2, 5).add(new ClassMenuTask14(2, 5))).toString());
        Assert.assertEquals("5/6", (new ClassMenuTask14(2, 4).add(new ClassMenuTask14(1, 3))).toString());
        Assert.assertEquals("13/15", (new ClassMenuTask14(1, 5).add(new ClassMenuTask14(4, 6))).toString());
    }
}