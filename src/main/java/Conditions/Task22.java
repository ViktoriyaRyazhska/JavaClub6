package Conditions;

public class Task22 {
    public static String CalculateAge(int birth, int yearTo) {
        if(birth == yearTo){
            return "You were born this very year!";
        }
        else if(birth < yearTo){
            int years = yearTo - birth;
            if(years == 1){
                return "You are 1 year old.";
            }
            else{
                return "You are " + years + " years old.";
            }
        }
        else{
            int years = birth - yearTo;
            if(years == 1){
                return "You will be born in 1 year.";
            }
            else{
                return "You will be born in " + years + " years.";
            }
        }
    }
}