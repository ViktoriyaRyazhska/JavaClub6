package Conditions;

public class Task30 {

    public static String updateLight(String current) {
        String res = "";
        if (current == "green") {
            res = "yellow";}
        else if (current == "yellow") {
            res = "red";}
        else if (current == "red") {
            res = "green";}
        return res;
    }
}
