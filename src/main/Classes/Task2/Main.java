package main.Classes.Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("You`ve chosen task2 : a method plus100");
        System.out.println("Choose an integer number, and the program will return your number incremented by 100");
        int number = scanner.nextInt();
        System.out.println(Task2.INST.plus100(number));
    }
}
