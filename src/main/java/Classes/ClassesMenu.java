package Classes;

import java.sql.SQLOutput;
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
                System.out.println("You`ve chosen task5 : Two fighters - one winner");
                System.out.println("Name your first fighter and set his hp and dmg");
                scanner.nextLine();
                String name = scanner.nextLine();
                int helth = scanner.nextInt();
                int demege = scanner.nextInt();

                Task5.Fighter fighter1 = new Task5.Fighter(name, helth, demege);
                System.out.println("Name your first fighter and set his hp and dmg");
                scanner.nextLine();
                String name1 = scanner.nextLine();
                int helth1 = scanner.nextInt();
                int demege1 = scanner.nextInt();
                System.out.println("Choose your second attacker: "+ name + " or "+ name1);
                scanner.nextLine();
                String firstAttacker = scanner.nextLine();
                Task5.Fighter fighter2 = new Task5.Fighter(name1, helth1, demege1);
                System.out.println("Winner is: ");
                System.out.println(Task5.declareWinner(fighter1, fighter2, firstAttacker));
                Thread.sleep(1300);

                break;
            case 6:

                System.out.println("You`ve chosen task2 : Building blocks \nIt will display you all the unnecessary info and nobody cares why");
                System.out.println("There are 3 elements: width, length, height, enter them");

                int[] arr = new int[3];

                for(int i=0; i<3; i++) {arr[i]=scanner.nextInt();}
                Block block = new Block(arr);
                System.out.println("Width: "+ block.getWidth()+"\nHeight: " +block.getHeight()+"\nLength: "+ block.getLength()+
                       "\nVolume: "+ block.getVolume()+"\nSurface area: " + block.getSurfaceArea());
                Thread.sleep(1100);

                System.out.println("That`s all");
                Thread.sleep(1100);
                System.out.println("do whatever you want with this info");
                Thread.sleep(1500);
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
