package Conditions;

public class Task30 {

    public static String updateLight(String current) {
        String res = "";
        if (current == "green") {
            res = "red";}
        else if (current == "yellow") {
            res = "green";}
        else if (current == "red") {
            res = "yellow";}
        return res;
    }
}
