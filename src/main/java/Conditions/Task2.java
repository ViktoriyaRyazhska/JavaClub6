package Conditions;

public class Task2 {
    public static String isDivisibleByTwoNumbers(int number, int fnumber, int snumber){
        boolean fflag = number % fnumber == 0;
        boolean sflag = number % snumber == 0;
        if (fflag && sflag) return "true because " + number + " is divisible by " + fnumber + " and " + snumber;
        if (fflag) return "false because " + number + " is not divisible by " + snumber;
        if (sflag) return "false because " + number + " is not divisible by " + fnumber;
        return "false because " + number + " is neither divisible by " + fnumber + " nor " + snumber;
    }
}
