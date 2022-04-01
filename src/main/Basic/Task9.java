package main.Basic;

public class Task9 {
    public static void main(String[] args) {System.out.println(makeNegative(4));}
    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }
}
