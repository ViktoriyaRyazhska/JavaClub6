package Conditions;

import java.util.Scanner;

public class ConditionsTask21 {

    public static String convert(){

        System.out.println("Convert a Boolean to a String.");
        System.out.println("Enter boolean [true] or [false].");

        Scanner sc = new Scanner(System.in);
        boolean bn = sc.nextBoolean();

        System.out.println("String is: " + bn);

        return Boolean.toString(bn);
    }

    public static String convert(boolean b){
        if(true) {
            return Boolean.toString(b);
        } else {
            return Boolean.toString(b);
        }
    }
}
