package main.Strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings = new String[2];

        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        strings[0] = firstName;
        strings[1] = lastName;

        System.out.println("Enter a city");
        String city = scanner.next();

        System.out.println("Enter a state");
        String state = scanner.next();

        System.out.println("Result is:");
        System.out.println(Task3.sayHello(strings, city, state));
    }
    public static String sayHello(String [] name, String city, String state){
        String n = "";
        for (String a : name){
            n += a;
        }
        n = n.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");

        return "Hello, " + n + "! Welcome to " + city + ", " + state + "!";
    }
}
