package main.Strings;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String with handle mistakes (Example: 1hk5dhfke0jhew): ");
        String  str= scanner.nextLine();
        System.out.println("Result: "+HandleMistakes(str));
    }

    public static String HandleMistakes(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '5':
                    chars[i] = 'S';
                    break;
                case '0':
                    chars[i] = 'O';
                    break;
                case '1':
                    chars[i] = 'I';
                    break;
                default:
                    break;
            }
        }
        return String.valueOf(chars);
    }
}
