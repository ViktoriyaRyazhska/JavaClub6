package main.Loop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of marks: ");
        int number =scanner.nextInt();
        System.out.println("Enter marks:");
        int[] marks = new int[number];
        for (int i = 0; i < number; i++) {
            marks[i]= scanner.nextInt();
        }
        System.out.println("Average: "+getAverage(marks));
    }

    public static int getAverage(int[] marks) {
        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            sumOfMarks += marks[i];
        }
        return sumOfMarks / marks.length;
    }
}
