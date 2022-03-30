package Conditions;

public class Task12 {
    public static String switchItUp(Integer number) {

        // a number between 0-9, return it in words.

        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return Integer.toString(number);
        }
    }

    public static void main(String[] args) {
        System.out.println(switchItUp(0));
        System.out.println(switchItUp(99));
    }
}
