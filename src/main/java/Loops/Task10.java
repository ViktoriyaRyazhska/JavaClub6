package Loops;

import java.util.Arrays;

public class Task10 {
    public static String[] sortEl(String[] arr) {
        String[] reversedArr = new String[arr.length];
        for (int i = 0; i < reversedArr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        String[] arr = { "1", "2", "3", "4" };
        System.out.println(Arrays.toString(sortEl(arr)));

    }
}
