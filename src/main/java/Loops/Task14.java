package Loops;

import java.util.Arrays;

public class Task14 {
    public static long[] gap(int g, long m, long n) {
        long[] res = new long[2];
        long first = 0;

        for (long x = m; x <= n; x++) {

            if (primeNum(x)) {
                if (first != 0 && x - first == g) {
                    res[0] = first;
                    res[1] = x;
                    break;
                } else {
                    first = x;
                }
            }
        }

        return res[0] == 0 ? null : res;
    }

    private static boolean primeNum(long x) {
        for (long j = 2; j < x / 2; j++) {
            if (x % j == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(2, 5, 7)));
        System.out.println(Arrays.toString(gap(4, 130, 200)));
        System.out.println(Arrays.toString(gap(6, 100, 110)));
    }

}
