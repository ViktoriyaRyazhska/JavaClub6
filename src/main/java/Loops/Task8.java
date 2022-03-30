package Loops;

import java.util.Arrays;

public class Task8 {
//    https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java

    public static void main(String[] args) {
//        System.out.println(grow(new int[]{2, 2, 2, 2, 2, 2}));
    }
    public static int grow(int[] x){
        int result =1;
        for (int i : x) {
            result *=i;
        }
        return result;

    }
}
