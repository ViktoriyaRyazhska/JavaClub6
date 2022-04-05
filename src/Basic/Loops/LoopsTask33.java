package Loops;

public class LoopsTask33 {
    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for (int i = 0; i < repeat; i++) s += string;
        return s;
    }
}
