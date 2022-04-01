package main.Strings;

public class Task7 {
    // https://www.codewars.com/kata/remove-string-spaces/
    public static void main(String[] args) {
        System.out.println(removeSpaces("hello world"));
    }
    public static String removeSpaces(final String x) {
        return x.replaceAll(" ", "");
    }
}