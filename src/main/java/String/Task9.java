package String;

public class Task9
{
    public static String position(char alphabet) {
        char copy = Character.toUpperCase(alphabet);
        return "Position of alphabet: " + ((int)copy - 64);
    }
}
