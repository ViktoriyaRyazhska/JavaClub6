package Conditions;

public class Task13 {
    public static String updateLight(String current) {
        if (current == "green") {
            return "yellow";
        } else if (current == "yellow") {
            return "red";
        } else {
            return "green";
        }
    }
}
