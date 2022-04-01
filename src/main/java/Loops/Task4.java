package Loops;

public class Task4 {
    // https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java

    public static void main(String[] args) {

        // System.out.println(Arrays.toString( new int[] {8, 2, 2, 2, 8}));
        // System.out.println(Arrays.toString(map(new int[]{4, 1, 1, 1, 4})));

    }

    public static int[] map(int[] arr) {
        int[] newMap = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newMap[i] = arr[i] * 2;
        }
        return newMap;
    }
}
