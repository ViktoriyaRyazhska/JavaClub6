package Conditions;

/**Task 4
 * @author zshaparenkoz*/

public class Task4 {
    public static String bonusTime(final int salary, final boolean bonus){

        int newSalary;
        if (bonus!=false){

            newSalary = salary * 10;
        } else {
            newSalary = salary;
        }

        return "£" + newSalary;
    }
}
