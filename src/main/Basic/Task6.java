package main.Basic;

//Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.

public class Task6 {
    public static void main(String[] args) {
        System.out.println(ToBinary(534));

    }
    public  static String ToBinary(int a){
        return Integer.toBinaryString(a);
    }

}
