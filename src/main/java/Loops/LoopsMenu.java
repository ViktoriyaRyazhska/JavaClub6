package Loops;

import java.util.Scanner;

public class LoopsMenu {
    public static void call(){
        System.out.println("You've been chosen Loops. Please select which task you want to test now:");
        for (int i = 1; i < 15; i++){
            System.out.println("Task " + i + ";");
        }
        System.out.println("Task 15.");
        System.out.print("Please enter number of task: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        switch (task){
            case 1:
                System.out.println("You selected task 1: String repeat.");
                System.out.print("Please enter String: ");
                String string = in.next();
                System.out.print("Please enter how many times: ");
                System.out.println(Task1.repeatStr(in.nextInt(), string));
                break;
            case 2:
                System.out.println("You selected task 2: Cat years, Dog years.");
                System.out.print("Please enter human years: ");
                int years = in.nextInt();
                System.out.println("Cat years: " + Task2.humanYearsCatYearsDogYears(years)[1]);
                System.out.println("Dog years: " + Task2.humanYearsCatYearsDogYears(years)[2]);
                break;
            case 3:
                System.out.println("You selected task 3: Get the mean of an array.");
                System.out.print("Please enter number of marks and marks: ");
                int[] marks = new int[in.nextInt()];
                for (int i = 0; i < marks.length; i++){
                    marks[i] = in.nextInt();
                }
                System.out.println("Average is: " + Task3.getAverage(marks));
                break;
            case 4:
                System.out.println("You selected task 4: Beginner - Lost Without a Map.");
                System.out.print("Please enter length and array: ");
                int[] array = new int[in.nextInt()];
                for (int i = 0; i < array.length; i++){
                    array[i] = in.nextInt();
                }
                System.out.print("Doubled array: ");
                for (int i : Task4.map(array)){
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            case 5:
                System.out.println("You selected task 5: Counting sheep...");
                System.out.print("Please enter length and array of booleans: ");
                Boolean[] arra = new Boolean[in.nextInt()];
                for (int i = 0; i < arra.length; i++){
                    arra[i] = in.nextBoolean();
                }
                System.out.println("Number of present: " + Task5.countSheeps(arra));
                break;
            case 6:
                System.out.println("You selected task 6: Reversed sequence.");
                System.out.print("Please enter the number: ");
                System.out.print("Array from n to 1: ");
                for(int i : Task6.reverse(in.nextInt())){
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            case 7:
                System.out.println("You selected task 7: How good are you really?");
                System.out.print("Please enter number and class points: ");
                int[] arry = new int[in.nextInt()];
                for (int i = 0; i < arry.length; i++){
                    arry[i] = in.nextInt();
                }
                System.out.print("Please enter your score: ");
                if (Task7.betterThanAverage(arry, in.nextInt())){
                    System.out.println("True, you're better than average.");
                } else {
                    System.out.println("False, you're worse than average.");
                }
                break;
            case 8:
                System.out.println("You selected task 8: Beginner - Reduce but Grow.");
                System.out.print("Please enter length and array: ");
                int[] ary = new int[in.nextInt()];
                for (int i = 0; i < ary.length; i++){
                    ary[i] = in.nextInt();
                }
                System.out.println("Result: " + Task8.grow(ary));
                break;
            case 9:
                System.out.println("You selected task 9: Sum of positive.");
                System.out.print("Please enter length and array: ");
                int[] aryy = new int[in.nextInt()];
                for (int i = 0; i < aryy.length; i++){
                    aryy[i] = in.nextInt();
                }
                System.out.println("Result: " + Task9.sum(aryy));
                break;
            case 10:
                System.out.println("You selected task 10: My head is at the wrong end!");
                System.out.print("Please enter array of 3 Strings: ");
                String[] aray = new String[3];
                for (int i = 0; i < aray.length; i++){
                    aray[i] = in.next();
                }
                System.out.print("Saved Meerkats!: ");
                for (String i : Task10.safeMeerkats(aray)){
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            case 11:
                System.out.println("You selected task 11: Twice as old.");
                System.out.print("Please enter father's and son's years: ");
                System.out.println("Years to twice: " + Task11.twiceAsOld(in.nextInt(), in.nextInt()));
                break;
            case 12:
                System.out.println("You selected task 12: Find Nearest square number.");
                System.out.print("Please enter the number: ");
                System.out.println("The nearest square: " + Task12.nearestSquare(in.nextInt()));
                break;
            case 13:
                System.out.println("You selected task 13: Grasshopper - Summation.");
                System.out.print("Please enter the number: ");
                System.out.println("The sum of every number from 1 to yours: " + Task13.summation(in.nextInt()));
                break;
            case 14:
                System.out.println("You selected task 14: Gap in Primes.");
                System.out.print("Please enter int and two longs: ");
                System.out.print("Result: ");
                for (long i : Task14.gap(in.nextInt(), in.nextLong(), in.nextLong())){
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            case 15:
                System.out.println("You selected task 15: 21 Sticks.");
                System.out.print("Please enter int: ");
                System.out.print("Result: " + Task15.makeMove(in.nextInt()));
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
