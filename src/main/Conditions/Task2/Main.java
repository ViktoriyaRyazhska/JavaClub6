package main.Conditions.Task2;

public class Main {
    public static void main(String[] args) {System.out.println(isDivisible(24,6, 3));}
    public static boolean isDivisible(long n, long x, long y) {
        return n%x == 0 && n%y == 0;
    }
}
