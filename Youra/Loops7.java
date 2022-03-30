package com.example.softserve;

public class Loops7 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int summ = yourPoints;
        for (int point : classPoints) {
            summ += point;
        }
        int count = classPoints.length + 1;
        int average = summ / count;

        if (yourPoints > average) {
            return true;
        } else {
            return false;
        }
    }
}
