package Collections;

import java.util.Scanner;

public class CollectionsMenu {
    public static void call(){
        System.out.println("You've been chosen Collections. Please select which task you want to test now:");
        for (int i = 1; i < 4; i++){
            System.out.println("Task " + i + ";");
        }
        System.out.println("Task 4.");
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
            default:
                break;
        }
    }
}
