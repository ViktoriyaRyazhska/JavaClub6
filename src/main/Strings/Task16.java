package main;

public class Task16 {
    public static void main(String[] args) {

        System.out.println(HandleMistakes("5jhjdshfjdsh 1hksdhfke0jhew"));
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
