package Conditions;

public class ConditionsTask23 {
    public static String CalculateAge(int birth, int yearTo) {
        int age = Math.abs(yearTo - birth);
        String year = " years";
        if (Math.abs(yearTo - birth) == 1) {year = " year";}
        if (yearTo < birth) {return "You will be born in " + age + year + ".";}
        if (birth < yearTo) {return "You are " + age + year + " old.";}
        return "You were born this very year!";
    }
}
