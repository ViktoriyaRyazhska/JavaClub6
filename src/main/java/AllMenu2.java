
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Collections.*;
import OOP.*;

public class AllMenu2 {
    static void menuOOP() {
        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("OOP:");
        System.out.println(
                "1 - The creation method must return an array of length 2 containing objects (representing Adam and Eve). Implement the Human, Man and Woman classes.");
        System.out.println(
                "2 - A class Dih4 that represents collection of rotations and reflections. An object (instance) of this class will have one of eight possible values, corresponding to the eight transformations.");
        System.out.println(
                "3 - A way to encode a string into its leetspeak version. a -> 4, e -> 3, l -> 1, m -> ^^, o -> 0, u -> (_)");
        System.out.println(
                "4 -  Implement Calculator.getTotalArea(). Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`");
        System.out.println("5 - Back to Menu");

        Scanner sc = new Scanner(System.in);
        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println(Task1.create());
                    break;
                }

                case "2": {
                    // ДОРОБИТИ
                    break;
                }

                case "3": {
                    task3 str = new task3();
                    System.out.println("a el mou AA Ee");
                    System.out.println(str.encode("a el mou AA Ee"));
                    break;
                }
                case "4": {
                    // ДОРОБИТИ
                    Task4 sut = new Task4();
                    double triangleBase = 6;
                    double triangleHeight = 4;
                    System.out.println("triangleBase = 6,  triangleHeight = 4 ");
                    // System.out.println(sut.getTotalArea(new Triangle(triangleBase,
                    // triangleHeight)));
                    break;
                }

                case "5": {
                    MainApp.menu();
                    break;
                }
            }

        }
    }

    static void menuString() {
        // ДОРОБИТИ
        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("String:");
        System.out.println("1 - You need to double the integer and return it.");
        System.out.println("2 - Implement a function which multiplies two numbers.");
        System.out.println(
                "3 - Calculate the volume of a cuboid with three values: length, width and the height of the cuboid.");
        System.out.println(
                "4 -  a function is_divisible() that will tell you whether a wall of a certain length can exactly fit an integer number of pixels of a certain length.");
        System.out.println(
                "5 -  a function that returns a greeting for a user, but greet for Johnny slightly different.");
        System.out.println("6 - a function to_binary/ToBinary which returns that number in a binary format.");
        System.out.println(
                "7 - Clock shows h hours, m minutes and s seconds after midnight. A function which returns the time since midnight in milliseconds.");
        System.out.println("8 - Given a year, return the century it is in.");
        System.out.println("9 - Given a number and have to make it negative");
        System.out.println(
                "10 - Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.");
        System.out.println("11 - Get the celsius converter working properly.");
        System.out.println("12 - Get the celsius converter working properly.");
        System.out.println("13 - Get the celsius converter working properly.");
        System.out.println("14 - Get the celsius converter working properly.");
        System.out.println("15 - Get the celsius converter working properly.");
        System.out.println("16 - Get the celsius converter working properly.");
        System.out.println("17 - Get the celsius converter working properly.");
        System.out.println("18 - Get the celsius converter working properly.");
        System.out.println("19 - Back to Menu");
    }

    static void menuCollections() {
        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("Collections:");
        System.out.println("1 - You are trying to put an object in java into an array");
        System.out.println("2 - Help Timmy find and fix the bug in his unfinished for loop!");
        System.out.println(
                "3 - The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.");
        System.out.println(
                "4 -  Create a class Dictionary which you can add words to and their entries");
        System.out.println("5 - Back to Menu");

        Scanner sc = new Scanner(System.in);
        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println(task1.added());

                    break;
                }

                case "2": {
                    // ДОРОБИТИ
                    // System.out.println(Task2.CreateList(4));
                    break;
                }

                case "3": {
                    List<Integer> listOne = new LinkedList<>(Arrays.asList(111, 2, 2, 2, 4, 3, 4, 5, 69, 7));
                    System.out.println(Arrays.asList(111, 2, 2, 2, 4, 3, 4, 5, 69, 7));
                    System.out.println(Task3.filterOddNumber(listOne));
                    break;
                }
                case "4": {
                    // ДОРОБИТИ
                    break;
                }

                case "5": {
                    MainApp.menu();
                    break;
                }
            }

        }
    }
}
