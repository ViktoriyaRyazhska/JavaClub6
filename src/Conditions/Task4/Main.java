package Conditions.Task4;

import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/do-i-get-a-bonus/
public class Main {
    public static void main(String[] args) {
        List<Fatcat> fatcats = new ArrayList<>();
        fatcats.add(new Fatcat("Artur", 12000, true));
        fatcats.add(new Fatcat("Maryan", 18000, false));
        fatcats.add(new Fatcat("Misha", 19000, false));
        fatcats.add(new Fatcat("Andriy", 12400, true));
        fatcats.add(new Fatcat("Oleg", 17000, true));
        fatcats.add(new Fatcat("Artem", 14000, true));

        for (Fatcat fatcat : fatcats
        ) {
            fatcat.GetBonus(fatcat.getSalary(), fatcat.isBonus());

        }
    }

}
