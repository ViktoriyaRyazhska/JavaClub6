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
                Task5 t = new Task5();
                Boolean[] arra = new Boolean[in.nextInt()];
                for (int i = 0; i < arra.length; i++){
                    arra[i] = in.nextBoolean();
                }
                System.out.println("Number of present: " + t.countSheeps(arra));
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
                /*System.out.println("You selected task 7: How good are you really?");
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
                break;*/
            case 8:
                System.out.println("You selected task 8: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 9:
                System.out.println("You selected task 9: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 10:
                System.out.println("You selected task 10: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 11:
                System.out.println("You selected task 11: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 12:
                System.out.println("You selected task 12: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 13:
                System.out.println("You selected task 13: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 14:
                System.out.println("You selected task 14: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            case 15:
                System.out.println("You selected task 15: ");
                System.out.print("Please enter: ");
                System.out.println();
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
