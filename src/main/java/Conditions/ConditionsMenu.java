package Conditions;

import java.util.Scanner;

public class ConditionsMenu {
    public static void call(){
        System.out.println("You've been chosen Conditions. Please select which task you want to test now:");
        for (int i = 1; i < 14; i++){
            System.out.println("Task " + i + ";");
        }
        System.out.println("Task 14.");
        System.out.print("Please enter number of task: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        switch (task){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
