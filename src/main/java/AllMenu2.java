
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Collections.*;
import OOP.*;
import String.Task1;
import String.Task10;
import String.Task11;
import String.Task12;
import String.Task13;
import String.Task14;
import String.Task15;
import String.Task16;
import String.Task17;
import String.Task18;
import String.Task2;
import String.Task3;
import String.Task4;
import String.Task5;
import String.Task6;
import String.Task7;
import String.Task8;
import String.Task9;

public class AllMenu2 {
    static void showOOPMenu(Scanner sc) {
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

        System.out.println();

        while (true) {
            switch (sc.next()) {

                case "1": {

                    System.out.println(Arrays.toString(OOP.Task1.create()));
                    showOOPMenu(sc);
                    break;
                }

                case "2": {
                    // TODO:
                    showOOPMenu(sc);
                    break;
                }

                case "3": {
                    task3 str = new task3();
                    System.out.println("a el mou AA Ee");
                    System.out.println(str.encode("a el mou AA Ee"));

                    showOOPMenu(sc);
                    break;
                }
                case "4": {
                    // TODO:
                    // Task4 sut = new Task4();
                    // double triangleBase = 6;
                    // double triangleHeight = 4;
                    System.out.println("triangleBase = 6,  triangleHeight = 4 ");
                    // System.out.println(sut.getTotalArea(new Triangle(triangleBase,
                    // triangleHeight)));

                    showOOPMenu(sc);
                    break;
                }

                case "5": {
                    MainApp.showMenu();
                    break;
                }
                default: {
                    showOOPMenu(sc);
                    break;
                }
            }

        }
    }

    static void showStringMenu(Scanner sc) {

        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("String:");
        System.out.println("1 - A function that can transform a number into a string");
        System.out.println("2 - Complete the solution so that it reverses the string passed into it.");
        System.out.println(
                "3 - A method sayHello() that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values");
        System.out.println(
                "4 -  Given an integer or a floating-point number, find its opposite");
        System.out.println(
                "5 -  The code provided is supposed replace all the dots . in the specified String str with dashes -");
        System.out.println(
                "6 - `Are you playing banjo?`. If your name starts with the letter `R` or `r`, you are playing banjo!");
        System.out.println(
                "7 - Remove the spaces from the string, then return the resultant string.");
        System.out.println(
                "8 - A function that will return a string that combines all of the letters of the three inputed strings in groups. `aa`, `bb` , `cc` => `abcabc`");
        System.out.println("9 - When provided with a letter, return its position in the alphabet.");
        System.out.println(
                "10 - Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.");
        System.out.println(
                "11 - `How old are you?` She always says, `x years old`. Write a program that returns the girl's age (0-9) as an integer.");
        System.out.println("12 - Debug celsius converter. Convert fahrenheit to celsius");
        System.out.println("13 - A function to convert a name into initials.  (Sam Harris => S.H)");
        System.out.println(
                "14 - a function that accepts 2 string arguments and returns an integer of the count of occurrences the 2nd argument is found in the first one.  ((`Hello`, `l`)  ==>  2)");
        System.out.println(
                "15 - You must sort a vector of strings alphabetically. The returned value must be a string, and have `***` between each of its letters.");
        System.out.println("16 - Correct the errors in the digitised text. S -> 5   O -> 0   I -> 1");
        System.out.println("17 - altERnaTIng cAsE <=> ALTerNAtiNG CaSe    altERnaTIng cAsE <=> ALTerNAtiNG CaSe");
        System.out
                .println("18 - Remove n exclamation marks in the sentence from left to right. n is positive integer.");
        System.out.println("19 - Back to Menu");

        System.out.println();

        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println("Integer: 25");
                    System.out.println("String: " + Task1.numberToString(25));

                    showStringMenu(sc);
                    break;
                }

                case "2": {
                    System.out.println("Input: some text");
                    System.out.println(Task2.solution("some text"));

                    showStringMenu(sc);
                    break;
                }

                case "3": {
                    String[] name = { "My", "Name" };
                    System.out.println("Input: " + Arrays.toString(name) + "City" + "State");
                    System.out.println(Task3.sayHello(name, "City", "State"));

                    showStringMenu(sc);
                    break;
                }
                case "4": {
                    System.out.println("Input: " + -40);
                    System.out.println(Task4.opposite(-40));

                    showStringMenu(sc);
                    break;
                }
                case "5": {
                    System.out.println("Input: T.ext la la .la.la...la");
                    System.out.println(Task5.replaceDots("T.ext la la .la.la...la"));

                    showStringMenu(sc);
                    break;
                }
                case "6": {

                    System.out.println("Input: Roberto");
                    System.out.println(Task6.areYouPlayingBanjo("Roberto"));

                    System.out.println("Input: Tom");
                    System.out.println(Task6.areYouPlayingBanjo("Tom"));
                    showStringMenu(sc);
                    break;
                }
                case "7": {
                    System.out.println("Input: `Text la la lala---la   `");
                    System.out.println(Task7.noSpace("Text la la lala---la   "));

                    showStringMenu(sc);
                    break;
                }
                case "8": {
                    System.out.println("Input: `this`, `test`, `lock` ");
                    System.out.println(Task8.tripleTrouble("this", "test", "lock"));

                    showStringMenu(sc);
                    break;
                }
                case "9": {
                    System.out.println("Input: `c`");
                    System.out.println(Task9.position('c'));

                    showStringMenu(sc);
                    break;
                }
                case "10": {
                    System.out.println("Input: `text`");
                    System.out.println(Task10.fakeBin("text"));

                    showStringMenu(sc);
                    break;
                }
                case "11": {
                    System.out.println("Input: `8 - is my age`");
                    System.out.println(Task11.howOld("8 - is my age"));

                    showStringMenu(sc);
                    break;
                }
                case "12": {
                    System.out.println("Input: 50");
                    System.out.println(Task12.weatherInfo(50));

                    System.out.println("Input: 23");
                    System.out.println(Task12.weatherInfo(23));

                    showStringMenu(sc);
                    break;
                }
                case "13": {
                    System.out.println("Input: `David Mendieta`");
                    System.out.println(Task13.abbrevName("David Mendieta"));

                    showStringMenu(sc);
                    break;
                }
                case "14": {
                    System.out.println("Input: `laaalalallaala`, 'a' ");
                    System.out.println(Task14.strCount("laaalalallaala", 'a'));

                    showStringMenu(sc);
                    break;
                }
                case "15": {
                    String[] abc = { "text", "TEXT1", "Abc", "idjf" };
                    System.out.println("Input: " + Arrays.toString(abc));
                    System.out.println(Task15.twoSort(abc));

                    showStringMenu(sc);
                    break;
                }
                case "16": {
                    System.out.println("Input: `505`");
                    System.out.println(Task16.correct("505"));

                    showStringMenu(sc);
                    break;
                }
                case "17": {
                    System.out.println("Input: `altERnaTIng cAsE <=> ALTerNAtiNG CaSe`");
                    System.out.println(Task17.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));

                    System.out.println("Input: `HELLO everyone!`");
                    System.out.println(Task17.toAlternativeString("HELLO everyone!"));

                    showStringMenu(sc);
                    break;
                }

                case "18": {
                    System.out.println("Input: `text lalal tatat` , 'a'");
                    System.out.println(Task18.remove("text lalal tatat ", 'a'));

                    showStringMenu(sc);
                    break;
                }

                case "19": {
                    MainApp.showMenu();
                    break;
                }
                default: {
                    showStringMenu(sc);
                    break;
                }
            }

        }
    }

    static void showCollectionsMenu(Scanner sc) {
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

        System.out.println();

        while (true) {
            switch (sc.next()) {

                case "1": {
                    System.out.println(task1.added());

                    showCollectionsMenu(sc);
                    break;
                }

                case "2": {
                    System.out.println(Collections.Task2.CreateList(4));
                    showCollectionsMenu(sc);
                    break;
                }

                case "3": {
                    List<Integer> listOne = new LinkedList<>(Arrays.asList(111, 2, 2, 2, 4, 3, 4, 5, 69, 7));
                    System.out.println(Arrays.asList(111, 2, 2, 2, 4, 3, 4, 5, 69, 7));
                    System.out.println(Collections.Task3.filterOddNumber(listOne));

                    showCollectionsMenu(sc);
                    break;
                }
                case "4": {
                    Collections.Task4 task = new Collections.Task4();
                    task.newEntry("Chair", "Chair uses for sitting");
                    System.out.println("*Dictionary contains meaning of Chair");
                    System.out.println(task.look("Chair"));
                    System.out.println(task.look("Table"));
                    showCollectionsMenu(sc);
                    break;
                }

                case "5": {
                    MainApp.showMenu();
                    break;
                }
                default: {
                    showCollectionsMenu(sc);
                    break;
                }
            }

        }
    }
}
