package String;

public class Task16 {
    public static String correct(String string) {
        string = string.replace('5', 'S');
        string = string.replace('0', 'O');
        string = string.replace('1', 'I');
        return string;
    }
}
