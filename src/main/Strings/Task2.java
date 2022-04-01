package main.Strings;

public class Task2 {
    // https://www.codewars.com/kata/reversed-strings
    public static void main(String[] args) {
        System.out.println(reversedString("world"));
        System.out.println(reversedString("word"));
    }
    public static String reversedString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
