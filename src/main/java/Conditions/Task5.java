package Conditions;

public class Task5 {
    public static String CalculateAge(int birth, int yearTo) {
        int age = 0;
        String message = "";

        if (birth == yearTo) {
            message = "You were born this very year!";
        } else if (birth - yearTo == 1) {
            message = "You will be born in 1 year.";
        } else if (yearTo - birth == 1) {
            message = "You are 1 year old.";
        } else if (birth < yearTo) {
            age = yearTo - birth;
            message = "You are " + age + " years old.";
        } else {
            age = birth - yearTo;
            message = "You will be born in " + age + " years.";
        }

        return message;
    }
}
