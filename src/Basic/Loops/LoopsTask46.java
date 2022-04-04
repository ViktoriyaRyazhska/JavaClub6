package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsTask46 {
    public static long[] gap() {

        System.out.println("Gap in Primes.");

        System.out.println("Enter wished gap between prime numbers: ");
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();

        System.out.println("Enter lover bound to find prime numbers couples: ");
        long m = scanner.nextInt();

        System.out.println("Enter upper bound to find prime numbers couples: ");
        long n = scanner.nextInt();

        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    System.out.println("The prime couple is " + Arrays.toString(new long[]{last, i}));
                    return new long[]{last, i};
                }
                last = i;
            }
        }

        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }


    public static long[] gap(int g, long m, long n) {

        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    System.out.println("The prime couple is " + Arrays.toString(new long[]{last, i}));
                    return new long[]{last, i};
                }
                last = i;
            }
        }

        return null;

    }
}
