package main.Loop;

public class Task1 {
    // https://www.codewars.com/kata/string-repeat

    public static void main(String[] args) {
        System.out.println(repeatStr(6, "I"));
        System.out.println(repeatStr(5, "Hello"));
    }
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
