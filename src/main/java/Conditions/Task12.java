package Conditions;

public class Task12 {
    static String numberSwitchedToString;

    public static String switchItUp(int number) {
        switch (number) {
            case 0:
                numberSwitchedToString = "Zero";
                break;
            case 1:
                numberSwitchedToString = "One";
                break;
            case 2:
                numberSwitchedToString = "Two";
                break;
            case 3:
                numberSwitchedToString = "Three";
                break;
            case 4:
                numberSwitchedToString = "Four";
                break;
            case 5:
                numberSwitchedToString = "Five";
                break;
            case 6:
                numberSwitchedToString = "Six";
                break;
            case 7:
                numberSwitchedToString = "Seven";
                break;
            case 8:
                numberSwitchedToString = "Eight";
                break;
            case 9:
                numberSwitchedToString = "Nine";
                break;
            default:
                numberSwitchedToString = "Something went wrong";
                break;
        }
        return numberSwitchedToString;
    }
}