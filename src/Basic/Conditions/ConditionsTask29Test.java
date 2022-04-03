package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionsTask29Test {

    @Test
    void sequence() {
        assertEquals(2, ConditionsTask29.sequence(20));
        assertEquals(2, ConditionsTask29.sequence(148));
        assertEquals(2, ConditionsTask29.sequence(111));
        assertEquals(2, ConditionsTask29.sequence(118));
        assertEquals(0, ConditionsTask29.sequence(41));
        assertEquals(0, ConditionsTask29.sequence(85));
        assertEquals(0, ConditionsTask29.sequence(117));
        assertEquals(1, ConditionsTask29.sequence(82));
        assertEquals(1, ConditionsTask29.sequence(72));
        assertEquals(1, ConditionsTask29.sequence(5101394));
        assertEquals(1, ConditionsTask29.sequence(163));
        assertEquals(1, ConditionsTask29.sequence(90));
    }
}