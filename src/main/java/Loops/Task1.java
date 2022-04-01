package Loops;

public class Task1 {
    public static void main(String[] args) {

    }

    public static String repeatStr(final int repeat, final String string) {
        String temp = "";

        for (int i = 0; i < repeat; i++) {
            temp += string;
        }

        return temp;
    }
}