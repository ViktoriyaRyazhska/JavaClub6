package Conditions;

import java.util.Arrays;
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
                System.out.println("You selected task 1: Opposite number.");
                System.out.print("Please enter an integer or floating-point number to opposite it: ");
                String s = in.next();
                if (Arrays.asList(s.chars().toArray()).contains(46)) {
                    System.out.println("Opposite number: " + Task1.getOpposite(Float.parseFloat(s)));
                } else {
                    System.out.println("Opposite number: " + Task1.getOpposite(Integer.parseInt(s)));
                }
                break;
            case 2:
                System.out.println("You selected task 2: Is n divisible by x and y?");
                System.out.print("Please enter n, x and y: ");
                System.out.println(Task2.isDivisibleByTwoNumbers(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case 3:
                System.out.println("You selected task 3: Convert a Boolean to a String.");
                System.out.print("Please enter boolean: ");
                System.out.println("It's String, trust me: " + Task3.booleanToString(in.nextBoolean()));
                break;
            case 4:
                System.out.println("You selected task 4: Do I get a bonus?");
                System.out.print("Please enter salary and boolean if has bonus: ");
                System.out.println("Total: " + Task4.bonusTime(in.nextInt(), in.nextBoolean()));
                break;
            case 5:
                System.out.println("You selected task 5: How old will I be in 2099?");
                System.out.print("Please enter year, when you born, and in which year you want to calculate: ");
                System.out.println(Task5.CalculateAge(in.nextInt(), in.nextInt()));
                break;
            case 6:
                System.out.println("You selected task 6: Rock Paper Scissors!");
                System.out.print("Please enter what players showing: ");
                System.out.println(Task6.rps(in.next(), in.next()));
                break;
            case 7:
                System.out.println("You selected task 7: Basic Mathematical Operations.");
                System.out.print("Please enter operator and two values: ");
                System.out.println("Result: " + Task7.basicMath(in.next(), in.nextInt(), in.nextInt()));
                break;
            case 8:
                System.out.println("You selected task 8: Opposites Attract.");
                System.out.print("Please enter number of petals of two flowers: ");
                if (Task8.isLove(in.nextInt(), in.nextInt())) {
                    System.out.println("True, they have love!");
                } else {
                    System.out.println("False, they don't have love(");
                }
                break;
            case 9:
                System.out.println("You selected task 9: Convert boolean values to strings 'Yes' or 'No'.");
                System.out.print("Please enter boolean: ");
                System.out.println("String: " + Task9.boolToWord(in.nextBoolean()));
                break;
            case 10:
                System.out.println("You selected task 10: Will there be enough space?");
                System.out.print("Please enter amount of people the bus can hold excluding the driver, on the bus and queue: ");
                System.out.println(Task10.enough(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case 11:
                System.out.println("You selected task 11: The Modulo-3 Sequence.");
                System.out.print("Please enter number: ");
                System.out.println("Answer: " + Task11.sequence(in.nextInt()));
                break;
            case 12:
                System.out.println("You selected task 12: Switch it Up!");
                System.out.print("Please enter the number: ");
                System.out.println("String: " + Task12.switchItUp(in.nextInt()));
                break;
            case 13:
                System.out.println("You selected task 13: Thinkful - Logic Drills: Traffic light.");
                System.out.print("Please enter color of traffic light: ");
                System.out.println("Next will be:" + Task13.updateLight(in.next()));
                break;
            case 14:
                System.out.println("You selected task 14: Transportation on vacation.");
                System.out.print("Please enter days: ");
                System.out.println("Rent will cost: " + Task14.rentalCarCost(in.nextInt()));
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
