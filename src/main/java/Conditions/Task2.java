package Conditions;

public class Task2 {
//    https://www.codewars.com/kata/5545f109004975ea66000086/train/java

    public static void main(String[] args) {
        System.out.println(false);
        System.out.println(isDivisible(3, 3, 4));
    }
    public static boolean isDivisible(long n, long x, long y) {
        // your code
        if(n%x ==0 && n%y==0){
            return true;
        }
        return false;
    }
}
