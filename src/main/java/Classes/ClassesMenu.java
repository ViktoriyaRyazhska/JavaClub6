package Classes;

import java.util.Scanner;

public class ClassesMenu {
    public static void call(){
        System.out.println("You've been chosen Classes. Please select which task you want to test now:");
        for (int i = 1; i < 6; i++){
            System.out.println("Task " + i + ";");
        }
        System.out.println("Task 6.");
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
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
