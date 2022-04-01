package main.Strings;

public class Task11 {
    public static void main(String[] args) {
        String str="5 year old";
        System.out.println(HowOldAreYou(str));

    }
    public static int HowOldAreYou(String s){
        return Character.getNumericValue(s.charAt(0));
    }
}
