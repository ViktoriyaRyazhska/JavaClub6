package String;

public class Task16 {
    public static String correctMistakes(String text){
        text = text.replace('5', 'S');
        text = text.replace('0', 'O');
        text = text.replace('1', 'I');
        return text;
    }
}
