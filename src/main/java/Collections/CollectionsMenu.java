package Collections;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Collections;
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
                System.out.println("You selected Task 1 :You are trying to put an object in javascript or java into an array, but it always returns error, solve it. ");
                System.out.println("List of strings with an object item" + Task1.push());
                break;
            case 2:
                System.out.println("You selected Task 2 :Help Timmy find and fix the bug in his unfinished for loop!");
                System.out.println("Please enter the number of elements");
                System.out.println("Your list: " + Task2.CreateList(in.nextInt()));
                break;
            case 3:
                System.out.println("You selected Task 3 :The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.");
                //Scanner sc = new Scanner(System.in);
                ArrayList<Integer> list = new ArrayList<>();
                System.out.println("Enter your numbers: " + in.nextLine());
                String inputString = in.nextLine();
                String [] integersInString = inputString.split(" ");
                int a[] = new int[integersInString.length];
                for (int i =0; i<integersInString.length; i++){
                    list.add(Integer.parseInt(integersInString[i]));
                }
                System.out.println("Your even numbers are: " + Task3.filterOddNumber(list));
                break;
            case 4:
                System.out.println("You selected Task 4 :In this kata, your job is to create a class Dictionary which you can add words to and their entries.");
                Dictionary d = new Dictionary();
                String word;
                String entry;

                System.out.println("Enter word[ ]entry )");
                word = in.next();
                entry = in.nextLine();

                d.newEntry(word, entry);
                System.out.println("Enter a word to find it's entry");
                System.out.println("This is you entry " + "|" + d.look(in.nextLine())
                        + " |" + " for word " + "|" + word + "|");
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
