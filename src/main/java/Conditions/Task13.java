package Conditions;

public class Task13 {
    public static String updateLight(String current) {
        String changeTo = "";
        switch(current) {
            case ("red"):
                changeTo = "green";
                break;
            case ("yellow"):
                changeTo = "red";
                break;
            case ("green"):
                changeTo = "yellow";
                break;
            default:
                changeTo = "error";
                break;
        }
        return changeTo;
    }
}
