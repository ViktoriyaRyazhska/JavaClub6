package String;

import java.util.Scanner;

public class StringMenu {
    public static void call(){
        System.out.println("You've been chosen String. Please select which task you want to test now:");
        for (int i = 1; i < 19; i++){
            System.out.println("Task " + i + ";");
        }
        System.out.print("Please enter number of task: ");
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        switch (task){
            case 1:
                System.out.println("You selected task 1");
                System.out.println("Enter a number you want to convert to String:");
                int inputNumber = scanner.nextInt();
                System.out.println("Result is:");
                System.out.println(Task1.numberToString(inputNumber));
                break;
            case 2:
                System.out.println("You selected task 2");
                System.out.println("Enter a string you want to reverse:");
                String stringToReverse = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task2.solution(stringToReverse));
                break;
            case 3:
                System.out.println("You selected task 3");
                System.out.println("Enter 2");

                int length = scanner.nextInt();
                String[] strings = new String[length];

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
                break;
            case 4:
                System.out.println("You selected task 4");
                System.out.println("Enter a number you want to get opposite of this:");
                int number = scanner.nextInt();
                System.out.println("Result is:");
                System.out.println(Task4.opposite(number));
                break;
            case 5:
                System.out.println("You selected task 5. Method in there will place all dots to something interesting");
                System.out.println("Enter a string");
                String string = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task5.replaceDots(string));
                break;
            case 6:
                System.out.println("You selected task 6. Let's check is human whose name which starts with R plays banjo");
                System.out.println("Enter a name");
                String name = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task6.areYouPlayingBanjo(name));
                break;
            case 7:
                System.out.println("You selected task 7. There will be no space in string");
                System.out.println("Enter a string");
                scanner.nextLine();
                String stringToCheck =scanner.nextLine();
                System.out.println("Result is:");
                System.out.println(Task7.noSpace(stringToCheck));
                break;
            case 8:
                System.out.println("You selected task 8. Let's look for a magic trick");
                System.out.println("Enter a string 3 times");
                String string1 = scanner.next();
                String string2 = scanner.next();
                String string3 = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task8.tripleTrouble(string1,string2,string3));
                break;
            case 9:
                System.out.println("You selected task 9. Let's see position in alphabet of your literal");
                System.out.println("Enter one literal");
                String s = scanner.next();
                char c = s.charAt(0);
                System.out.println("Result is:");
                System.out.println(Task9.position(c));
                break;
            case 10:
                System.out.println("You selected task 10");
                System.out.println("Enter a number to be converted to fake binary");
                String numberString = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task10.fakeBin(numberString));
                break;
            case 11:
                System.out.println("You selected task 11");
                System.out.println("Enter a string: (number -> between 0 and 9) years old");
                String herOld = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task11.howOld(herOld));
                break;
            case 12:
                System.out.println("You selected task 12");
                System.out.println("Enter a temperature to be checked in weather info");
                int temperature = scanner.nextInt();
                System.out.println("Result is:");
                System.out.println(Task12.weatherInfo(temperature));
                break;
            case 13:
                System.out.println("You selected task 13");
                System.out.println("Enter your full name to be converted to abbrev name");
                String nameToBeConverted = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task13.abbrevName(nameToBeConverted));
                break;
            case 14:
                System.out.println("You selected task 14");
                System.out.println("Enter some string");
                String stringToWorkWith = scanner.next();

                System.out.println("Enter a letter you want to see how much it repeats in word");
                String  ch = scanner.next();
                char chachar = ch.charAt(0);
                System.out.println("Result is:");
                System.out.println(Task14.strCount(stringToWorkWith, chachar));
                break;
            case 15:
                System.out.println("You selected task 15. There will be sorted array with stars");
                System.out.print("Enter the number of elements you want to store: ");

                int n=scanner.nextInt();
                String[] arr = new String[n];

                System.out.println("Enter the elements of the array(they are strings):");
                for(int i=0; i<n; i++) {arr[i]=scanner.next();}

                System.out.println("Result is:");
                System.out.println(Task15.SortAndStar(arr));
                break;
            case 16:
                System.out.println("You selected task 16");
                System.out.println("Enter some string to see if it replaces some chars(5-> S, 0->O, 1->I)");
                String str = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task16.correctMistakes(str));
                break;
            case 17:
                System.out.println("You selected task 17");
                System.out.println("Enter a string with to be converted to alternative string");
                String strng = scanner.next();
                System.out.println("Result is:");
                System.out.println(Task17.toAlternativeString(strng));
                break;
            case 18:
                System.out.println("You selected task 18");
                System.out.println("Enter a string to remove exclamation mark");
                String someString = scanner.next();
                System.out.println("Enter a number of exclamations");
                int num = scanner.nextInt();
                System.out.println("Result is:");
                System.out.println(Task18.removeExclamationMarks(someString,num));
                break;
            default:
                System.out.println("No task found. Please try again.");
                break;
        }
    }
}
