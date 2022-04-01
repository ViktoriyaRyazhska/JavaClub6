package Conditions;

/**Task 5
 * @author zshaparenkoz*/

public class Task5 {
    public static String CalculateAge(int birth, int yearTo){
        String s = "";
        int years;
        if(birth < yearTo){
            years = yearTo - birth;
            if (years != 1){
                s = "You are " + years + " years old.";
            } else {
                s = "You are 1 year old.";
            }
        }
        else if (birth > yearTo){
            years = birth - yearTo;
            if (years != 1){
                s = "You will be born in " + years + " years.";
            } else {
                s = "You will be born in 1 year.";
            }
        } else {
            s = "You were born this very year!";
        }

        return s;
    }
}
