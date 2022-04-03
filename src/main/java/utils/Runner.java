package utils;

import Basic.Task3;

public class Runner {
    private ConsoleScanner sc;
    public Runner() {
        sc = new ConsoleScanner();
    }
    public void TASK_3() {
        System.out.println("Enter the length, width and the height: ");
        double length = doublePositive(sc.readDouble());
        double width = doublePositive(sc.readDouble());
        double height = doublePositive(sc.readDouble());
        System.out.println("Result: " + Task3.getVolumeOfCuboid(length,width,height));
    }

    private int intPositive(int num) {
        while (num <= 0) {
            System.out.println("Please enter number > 0");
            num = sc.readInt();
        }
        return num;
    }

    private float floatPositive(float number) {
        while (number <= 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readFloat();
        }
        return number;
    }

    private int[] intArrayPositive(int[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] <= 0) {
                System.out.println("Please enter all numbers >= 0");
                number = sc.readIntArray();
            }
        }
        return number;
    }

    private int intNotZero(int number) {
        while (number == 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readInt();
        }
        return number;
    }

    private long longPositive(long number) {
        while (number <= 0) {
            System.out.println("Please enter number > 0");
            number = sc.readLong();
        }
        return number;
    }

    double doublePositiveOrNull(double number) {
        while (number < 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readDouble();
        }
        return number;
    }

    private double[] doubleArrayPositive(double[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] <= 0) {
                System.out.println("Please enter all numbers >= 0");
                number = sc.readDoubleArray();
            }
        }
        return number;
    }

    private double doublePositive(double number) {
        while (number <= 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readDouble();
        }
        return number;
    }

    public void setTasks(int number) {
        switch (number) {
            case 1:
                TASK_3();
                break;
        }
    }
}
