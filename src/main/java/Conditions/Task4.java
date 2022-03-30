package Conditions;

public class Task4 {
    public static String bonusTime(int salary, boolean bonus) {
        // if bonus== true => salary * 10 "£" = "\u00A3"
        // if bonus== false => salary "£" = "\u00A3"

        return bonus == false ? "\u00A3" + salary : "\u00A3" + salary * 10;

    }

    public static void main(String[] args) {
        System.out.println(bonusTime(4, false));
    }
}
