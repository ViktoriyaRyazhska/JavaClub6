package Classes;

import java.util.Scanner;

public class ClassesMenu {
    public static void call() throws InterruptedException {
        System.out.println("You've been chosen Classes. Please select which task you want to test now:");
        for (int i = 1; i < 7; i++){
            System.out.println("Task " + i + ";");
        }

        System.out.print("Please enter number of task: ");
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        switch (task){
            case 1:
                System.out.println("You`ve chosen task1 :Lombok Encapsulation");
                System.out.println("it does nothing ^-^ \n Thank you for choosing our company" );
                Thread.sleep(1300);
                break;
            case 2:
                System.out.println("You`ve chosen task2 : a method plus100");
                System.out.println("Choose an integer number, and the program will return your number incremented by 100");
                int number = scanner.nextInt();
                System.out.println(Task2.INST.plus100(number));
                Thread.sleep(1300);
                break;
            case 3:

                System.out.println("You`ve chosen task3 : Fractions class \n it adds two fractions which are strangely written (4/5 is (4,5))");
                System.out.println("now enter numerator and then denominator and then the same for the next fraction");
                scanner.nextLine();
                int numerator = scanner.nextInt();
                int denominator = scanner.nextInt();
                int numerator1 = scanner.nextInt();
                int denominator1 = scanner.nextInt();
                Task3 task31 = new Task3(numerator, denominator);
                Task3 task32 = new Task3(numerator1, denominator1);
                System.out.println(task31.add(task32));
                Thread.sleep(1300);

                break;
            case 4:
                System.out.println("Nothing here hehe");
                Thread.sleep(1300);
                break;
            case 5:
                System.out.println("You`ve chosen task2 : Two fighters - one winner");
                scanner.nextLine();
                String name = scanner.nextLine();
                int helth = scanner.nextInt();
                int demege = scanner.nextInt();

                Task5.Fighter fighter1 = new Task5.Fighter(name, helth, demege);
                scanner.nextLine();
                name = scanner.nextLine();
                helth = scanner.nextInt();
                demege = scanner.nextInt();
                Task5.Fighter fighter2 = new Task5.Fighter(name, helth, demege);
                break;
            case 6:
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
