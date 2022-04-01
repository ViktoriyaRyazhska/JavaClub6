package String;

public class Task13 {
    // https://www.codewars.com/kata/abbreviate-a-two-word-name/

    public static String abbrevName(String name) {
        String result;
        final String[] split = name.split(" ");
        result = (split[0].charAt(0) + "." + split[1].charAt(0)).toUpperCase();
        return result;
    }
}
