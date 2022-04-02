package Conditions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void testIfRentalCarCostUnder3Days(int days){
        int cost = days * 40;
        assertEquals(Task14.rentalCarCost(days),cost);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5, 6})
    public void testIfRentalCarCostOver3AndLess7DaysOffers20$OffCost(int days){
        int cost = days * 40 - 20;
        assertEquals(Task14.rentalCarCost(days),cost);
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 8, 9, 13, 20})
    public void testIfRentalCarCostOver7DaysOffers50$OffCost(int days){
        int cost = days*40 - 50;
        assertEquals(Task14.rentalCarCost(days),cost);
    }

}