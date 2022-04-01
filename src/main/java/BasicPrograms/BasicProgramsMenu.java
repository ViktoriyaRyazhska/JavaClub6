package BasicPrograms;

import java.util.Scanner;

public class BasicProgramsMenu {
    public static void call(){
        System.out.println("You've been chosen Basic Programs. Please select which task you want to test now:");
        for (int i = 1; i < 11; i++){
            System.out.println("Task " + i + ";");
        }
        System.out.println("Task 11.");
        System.out.print("Please enter number of task: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        switch (task){
            case 1:
                System.out.println("You selected task 1: You Can't Code Under Pressure #1.");
                System.out.print("Please enter the number: ");
                System.out.println("Doubled it: " + Task1.doubleInteger(in.nextInt()));
                break;
            case 2:
                System.out.println("You selected task 2: Function 3 - multiplying two numbers.");
                System.out.print("Please enter two numbers: ");
                System.out.println("Product of this numbers: " + Task2.multiply(in.nextInt(), in.nextInt()));
            case 3:
                System.out.println("You selected task 3: Volume of a Cuboid.");
                System.out.print("Please enter length, width and height of the cuboid: ");
                System.out.println("Volume of the cuboid: " + Task3.getVolumeOfCuboid(in.nextDouble(), in.nextDouble(), in.nextDouble()) + ".");
                break;
            case 4:
                System.out.println("You selected task 4: Thinkful - Number Drills: Pixelart planning.");
                System.out.print("Please enter the size of the wall and the size of a pixel: ");
                if (Task4.isDivisible(in.nextInt(), in.nextInt())) {
                    System.out.println("True, you can fit an exact number of pixels on the wall.");
                } else {
                    System.out.println("False, you can't fit an exact number of pixels on the wall.");
                }
                break;
            case 5:
                System.out.println("You selected task 5: Jenny's secret message.");
                System.out.print("Please enter name of user: ");
                System.out.println(Task5.greet(in.next()));
                break;
            case 6:
                System.out.println("You selected task 6: Convert to Binary.");
                System.out.print("Please enter the decimal number: ");
                System.out.println("Number in binary: " + Task6.toBinary(in.nextInt()));
                break;
            case 7:
                System.out.println("You selected task 7: Beginner Series #2 Clock.");
                System.out.print("Please enter hour, minutes and seconds: ");
                System.out.println("Time since midnight: " + Task7.timeSinceMidnight(in.nextInt(), in.nextInt(), in.nextInt()) + " ms");
                break;
            case 8:
                System.out.println("You selected task 8: Century From Year.");
                System.out.print("Please enter year: ");
                System.out.println("Century of this year: " + Task8.getCentury(in.nextInt()));
                break;
            case 9:
                System.out.println("You selected task 9: Return Negative.");
                System.out.print("Please enter number: ");
                System.out.println("Negative of number: " + Task9.makeNegative(in.nextInt()));
                break;
            case 10:
                System.out.println("You selected task 10: Age Range Compatibility Equation.");
                System.out.print("Please enter age: ");
                System.out.println("Age range of dating: " + Task10.datingRange(in.nextInt()));
                break;
            case 11:
                System.out.println("You selected task 11: Grasshopper - Debug.");
                System.out.print("Please enter the temperature: ");
                System.out.println(Task11.weatherInfo(in.nextDouble()));
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
        in.close();
    }
}
