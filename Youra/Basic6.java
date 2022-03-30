package com.example.softserve;

public class Basic6 {
    public static int toBinary(int n) {
        int binary = 0;
        int adder = 1;
        while (n > 0) {
            binary += (n % 2) * adder;
            adder *= 10;
            n /= 2;
        }
        return binary;
    }
}
