package main.Conditions.Task9;

import java.util.Scanner;

//https://www.codewars.com/kata/convert-boolean-values-to-strings-yes-or-no/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter true or false");
        boolean b = Boolean.parseBoolean(scanner.next());
        System.out.println(b+" convert to string - "+ConvertToString(b));
    }
    public static String ConvertToString(boolean b){
        if(b)return "Yes";
        else return "No";

    }
}
