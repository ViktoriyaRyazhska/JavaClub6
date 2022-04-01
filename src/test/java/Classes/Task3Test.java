package Classes;
/**     Task 3
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void testAdd() {
        assertEquals(new Task3(838923, 926885), new Task3(610, 941).add(new Task3(253, 985)));
        assertEquals(new Task3(16880, 3591), new Task3(956, 798).add(new Task3(662, 189)));
        assertEquals(new Task3(1011239, 417585), new Task3(694, 485).add(new Task3(853, 861)));
        assertEquals(new Task3(191737, 20757), new Task3(982, 111).add(new Task3(219, 561)));
    }
}