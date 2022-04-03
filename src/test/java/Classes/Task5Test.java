package Classes;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void testDeclareWinnerMethod() {
        Task5.Fighter fighter1 = new Task5.Fighter("Rostyk",45, 12);
        Task5.Fighter fighter2 = new Task5.Fighter("Roman",12, 15);
        assertEquals("Rostyk", Task5.declareWinner(fighter1,fighter2,"Rostyk"));

        Task5.Fighter fighter3 = new Task5.Fighter("Lil Pip",45, 2);
        Task5.Fighter fighter4 = new Task5.Fighter("Misha",120, 15);
        assertEquals("Misha", Task5.declareWinner(fighter3,fighter4,"Misha"));

        Task5.Fighter fighter5 = new Task5.Fighter("Maryna",45, 2);
        Task5.Fighter fighter6 = new Task5.Fighter("Vitalik",12, 5);
        assertEquals("Maryna", Task5.declareWinner(fighter5,fighter6,"Maryna"));
    }
}