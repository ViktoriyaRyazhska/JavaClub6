import java.util.Arrays;
import java.util.Scanner;
import Basic.*;
import Basic.Task3;
import Loops.Task5;
import com.sun.xml.internal.bind.v2.TODO;

public class AllMenu {
    static void showBasicMenu(Scanner sc) {
        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("Basic:");
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
        System.out.println("12 - Back to Menu");

        System.out.println();
        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println("Input: 2");
                    System.out.println(task1.doubleInteger(2));
                    showBasicMenu(sc);
                    break;
                }

                case "2": {
                    System.out.println("Input: 2 , 3");
                    System.out.println(Basic.Task2.multiply(2, 3));
                    showBasicMenu(sc);
                    break;
                }

                case "3": {

                    System.out.println("Input:  10, 12, 5");
                    System.out.println(Task3.getVolumeOfCubiod(10, 12, 5));
                    showBasicMenu(sc);
                    break;
                }
                case "4": {
                    System.out.println("Input:  100, 21");
                    System.out.println(Basic.Task4.isDivisible(100, 21));
                    showBasicMenu(sc);
                    break;
                }
                case "5": {
                    System.out.println("Input:  JOhNny");
                    System.out.println(Basic.task5.greet("JOhNny"));

                    System.out.println("Input:  Tom");
                    System.out.println(Basic.task5.greet("Tom"));
                    showBasicMenu(sc);
                    break;
                }
                case "6": {
                    System.out.println("Input:  100");
                    System.out.println(Basic.Task6.toBinary(100));
                    showBasicMenu(sc);
                    break;
                }
                case "7": {
                    System.out.println("Input:  1, 1, 1");
                    System.out.println(Basic.Task7.past(1, 1, 1));
                    showBasicMenu(sc);
                    break;
                }
                case "8": {
                    System.out.println("Input:  1962");
                    System.out.println(Basic.Task8.century(1962));
                    showBasicMenu(sc);
                    break;
                }
                case "9": {
                    System.out.println("Input:  -76");
                    System.out.println(Basic.task9.makeNegative(-76));
                    showBasicMenu(sc);
                    break;
                }
                case "10": {
                    System.out.println("Input:  21");
                    System.out.println(Basic.Task10.datingRange(21));
                    showBasicMenu(sc);
                    break;
                }
                case "11": {
                    System.out.println("Input:  70");
                    System.out.println(Basic.Task11.weatherInfo(70));
                    showBasicMenu(sc);
                    break;
                }
                case "12": {
                    MainApp.showMenu();
                    break;
                }
            }
        }

    }

    static void showClassesMenu(Scanner sc) {
        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("Classes:");
        System.out.println(
                "1 - We have to do modifications to properly encapsulate info.Add a constructor that can receive parameters for all of the fields");
        System.out.println(
                "2 - a method plus100 which is supposed to return the number of the parameter incremented by 100.");
        System.out.println(
                "3 - Class 'Fraction', which accepts two arguments (numerator, denominator).");
        System.out.println(
                "4 -  Write a simple console-style drawing board program.");
        System.out.println(
                "5 -  Create a function that returns the name of the winner in a fight between two fighters.");
        System.out.println(
                "6 - Write a class Block. Define these methods: getWidth(), getLength(), getHeight(), getVolume(), getSurfaceArea()");
        System.out.println("7 - Back to Menu");

        System.out.println();
        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println("Input:  10, value, asd");
                    System.out.println(new Classes.Task1(10, "value", "asd").toString());
                    showClassesMenu(sc);
                    break;
                }

                case "2": {
                    System.out.println("Input:  -100");
                    System.out.println(Classes.task2.INST.plus100(-100));
                    showClassesMenu(sc);
                    break;
                }

                case "3": {
                    System.out.println("Input:  2 , 5");
                    System.out.println("Input:  4 , 5");
                    Classes.Task3 t1 = new Classes.Task3(2, 5);
                    Classes.Task3 t2 = new Classes.Task3(4, 5);
                    System.out.println(t1.add(t2));
                    showClassesMenu(sc);
                    break;
                }
                case "4": {
                    Classes.Task4.Enter(sc);
                    showClassesMenu(sc);
                    break;
                }
                case "5": {
                    // TODO: 01.04.2022
                    // System.out.println(Classes.Task5.declareWinner(new Classes.Fighter("Lew", 10,
                    // 2), new Fighter("Harry", 5, 4), "Lew"));
                    showClassesMenu(sc);
                    break;
                }
                case "6": {
                    System.out.println("Input:  2, 4, 6");
                    Classes.task6 b = new Classes.task6(new int[] { 2, 4, 6 });

                    System.out.println("Width:" + b.getWidth()); // -> 2

                    System.out.println("Length:" + b.getLength()); // -> 4

                    System.out.println("Height:" + b.getHeight()); // -> 6

                    System.out.println("Volume:" + b.getVolume()); // -> 48

                    System.out.println("SurfaceArea:" + b.getSurfaceArea()); // -> 88

                    showClassesMenu(sc);
                    break;
                }
                case "7": {
                    MainApp.showMenu();
                    break;
                }
            }
        }

    }

    static void showConditionsMenu(Scanner sc) {

        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("Conditions:");
        System.out.println(
                "1 - Very simple, given an integer or a floating-point number, find its opposite.");
        System.out.println(
                "2 - Create a function that checks if a number n is divisible by two numbers x AND y. \n" +
                        "All inputs are positive, non-zero digits.");
        System.out.println(
                "3 - Implement a function which convert the given boolean value into its string representation.");
        System.out.println(
                "4 -  Build a function that takes in two arguments (salary, bonus). \n" +
                        "Salary will be an integer, and bonus a boolean.");
        System.out.println(
                "5 - How old will I be in 2099? write a function that takes two parameters: \n" +
                        "the year of birth and the year to count years in relation to.");
        System.out.println(
                "6 - Rock Paper Scissors\n" +
                        "Let's play! You have to return which player won! In case of a draw return Draw!.");
        System.out.println(
                "7 - Your task is to create a function that does four basic mathematical operations.\n" +
                        "The function should take three arguments - operation(string/char), value1(number), value2(number).");
        System.out.println(
                "8 - Write a function that will take the number of petals of each flower\n" +
                        "and return true if they are in love and false if they aren't.");
        System.out.println(
                "9 - Complete the method that takes a boolean value and return \n" +
                        "a \"Yes\" string for true, \n" +
                        "or a \"No\" string for false.");
        System.out.println(
                "10 - You have to write a function that accepts three parameters:\n" +
                        "cap is the amount of people the bus can hold excluding the driver.\n" +
                        "on is the number of people on the bus excluding the driver.\n" +
                        "wait is the number of people waiting to get on to the bus excluding the driver.");
        System.out.println(
                "11 - Consider a sequence where the first two numbers are 0 and 1 \n" +
                        "and the next number of the sequence is the sum of the previous 2 modulo 3. \n" +
                        "Write a function that finds the nth number of the sequence.");
        System.out.println("12 - When provided with a number between 0-9, return it in words.");
        System.out.println("13 - Complete the function that takes a string as an argument \n" +
                "representing the current state of the light and returns a string \n" +
                "representing the state the light should change to..");
        System.out.println("14 - Every day you rent the car costs $40. \n" +
                "If you rent the car for 7 or more days, you get $50 off your total. \n" +
                "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.\n" +
                "\n" +
                "Write a code that gives out the total amount for different days(d).");
        System.out.println("15 - Back to Menu");

        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println(Conditions.Task1.opposite(2));
                    showConditionsMenu(sc);
                    break;
                }

                case "2": {
                    System.out.println(Conditions.Task2.isDivisible(3, 3, 4));
                    showConditionsMenu(sc);
                    break;
                }

                case "3": {
                    System.out.println(Conditions.Task3.convert(true));
                    showConditionsMenu(sc);
                    break;
                }
                case "4": {
                    System.out.println(Conditions.Task4.bonusTime(4, false));
                    showConditionsMenu(sc);
                    break;
                }
                case "5": {
                    System.out.println(Conditions.Task5.CalculateAge(2002, 2022));
                    showConditionsMenu(sc);
                    break;
                }
                case "6": {
                    System.out.println(Conditions.Task6.rps("rock", "scissors"));
                    showConditionsMenu(sc);
                    break;
                }
                case "7": {
                    System.out.println(Conditions.Task7.basicMath("+", 5, 5));
                    showConditionsMenu(sc);
                    break;
                }
                case "8": {
                    System.out.println(Conditions.Task8.isLove(4, 5));
                    showConditionsMenu(sc);
                    break;
                }
                case "9": {
                    System.out.println(Conditions.Task9.boolToWord(true));
                    showConditionsMenu(sc);
                    break;
                }
                case "10": {
                    System.out.println(Conditions.Task10.enough(100, 60, 50));
                    showConditionsMenu(sc);
                    break;
                }
                case "11": {
                    System.out.println(Conditions.Task11.sequence(10));
                    showConditionsMenu(sc);
                    break;
                }
                case "12": {
                    System.out.println(Conditions.Task12.sequence(99));
                    showConditionsMenu(sc);
                    break;
                }
                case "13": {
                    System.out.println(Conditions.Task13.updateLight("green"));
                    showConditionsMenu(sc);
                    break;
                }
                case "14": {
                    System.out.println(Conditions.Task14.rentalCarCost(5));
                    showConditionsMenu(sc);
                    break;
                }
                case "15": {
                    MainApp.showMenu();
                    break;
                }
            }
        }

    }

    static void showLoopsMenu(Scanner sc) {

        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("Loops:");
        System.out.println(
                "1 - Write a function called repeatStr which repeats the given string string exactly n times.");
        System.out.println(
                "2 - I have a cat and a dog.\n" +
                        "I got them at the same time as kitten/puppy. That was humanYears years ago.\n" +
                        "Return their respective ages now as [humanYears,catYears,dogYears]");
        System.out.println(
                "3 - Return the average of the given array rounded down to its nearest integer.");
        System.out.println(
                "4 - Given an array of integers, return a new array with each value doubled.");
        System.out.println(
                "5 - Consider an array/list of sheep where some sheep may be missing from their place. \n" +
                        "We need a function that counts the number of sheep present in the array (true means present).");
        System.out.println(
                "6 - Build a function that returns an array of integers from n to 1 where n>0.");
        System.out.println(
                "7 - You receive an array with your peers' test scores. Now calculate the average and compare your score!");
        System.out.println(
                "8 - Given a non-empty array of integers, return the result of multiplying the values together in order.");
        System.out.println(
                "9 - You get an array of numbers, return the sum of all of the positives ones.");
        System.out.println(
                "10 - Save the animals by switching them back.\n" +
                        "You will be given an array which will have three values (tail, body, head).\n" +
                        "It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).");
        System.out.println("" +
                "11 - Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).");
        System.out.println(
                "12 - Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.");
        System.out.println(
                "13 - Write a program that finds the summation of every number from 1 to num. \n" +
                        "The number will always be a positive integer greater than 0.");
        System.out.println(
                "14 - The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. \n" +
                        "From 3 to 5 the gap is 2. From 7 to 11 it is 4. \n" +
                        "Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43");
        System.out.println(
                "15 - In this game, there are 21 sticks lying in a pile. \n" +
                        "Players take turns taking 1, 2, or 3 sticks. \n" +
                        "The last person to take a stick wins. ");
        System.out.println("16 - Back to Menu");

        System.out.println();

        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println(Loops.Task1.repeatStr(4, "string"));
                    showLoopsMenu(sc);
                    break;
                }

                case "2": {
                    System.out.println(Arrays.toString(Loops.Task2.humanYearsCatYearsDogYears(10)));
                    showLoopsMenu(sc);
                    break;
                }

                case "3": {
                    System.out.println(Loops.Task3.getAverage(new int[] { 167, -2, 16, 99, 26, 92, 43, -234, 35, 80 }));
                    showLoopsMenu(sc);
                    break;
                }
                case "4": {
                    System.out.println(Arrays.toString(Loops.Task4.map(new int[] { 4, 1, 1, 1, 4 })));
                    showLoopsMenu(sc);
                    break;
                }
                case "5": {
                    Loops.Task5 task5 = new Task5();
                    System.out.println(task5.countSheeps(new Boolean[] { false, true, false, true }));
                    showLoopsMenu(sc);
                    break;
                }
                case "6": {
                    System.out.println(Arrays.toString(Loops.Task6.reverse(5)));
                    showLoopsMenu(sc);
                    break;
                }
                case "7": {
                    System.out.println(Loops.Task7.betterThanAverage(new int[] { 3, 1, 4, 5, 2 }, 2));
                    showLoopsMenu(sc);
                    break;
                }
                case "8": {
                    System.out.println(Loops.Task8.grow(new int[] { 2, 2, 2, 2, 2, 2 }));
                    showLoopsMenu(sc);
                    break;
                }
                case "9": {
                    System.out.println(Loops.Task9.sum(new int[] { 2, -5, 8, 0, -24, 12, 5, 4 }));
                    showLoopsMenu(sc);
                    break;
                }
                case "10": {
                    System.out.println(Arrays.toString(Loops.Task10.sortEl(new String[] { "1", "2", "3", "4" })));
                    showLoopsMenu(sc);
                    break;
                }
                case "11": {
                    System.out.println(Loops.Task11.TwiceAsOld(39, 5));
                    showLoopsMenu(sc);
                    break;
                }
                case "12": {
                    System.out.println(Loops.Task12.nearestSq(111));
                    showLoopsMenu(sc);
                    break;
                }
                case "13": {
                    System.out.println(Loops.Task13.summation(5));
                    showLoopsMenu(sc);
                    break;
                }
                case "14": {
                    System.out.println(Arrays.toString(Loops.Task14.gap(5, 1245, 65456)));
                    showLoopsMenu(sc);
                    break;
                }
                case "15": {
                    System.out.println(Loops.Task15.makeMove(6));
                    showLoopsMenu(sc);
                    break;
                }
                case "16": {
                    MainApp.showMenu();
                    break;
                }
            }
        }
    }

}
