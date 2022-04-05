package utils;

import Basic.*;
import Classes.*;
import Collections.*;
import Conditions.*;
import Loops.*;


import OOP.*;
import OOP.Task49;
import String.*;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

import static OOP.Task48.*;


public class Runner {
    private ConsoleScanner sc;
    private Folders folders;


    public Runner(Folders folderById) {
        sc = new ConsoleScanner();
    }
    public void setFolders(Folders folderById) {
        this.folders = folderById;
        switch (folders) {
            case BASIC:
                System.out.println("Tasks from 1 to 11");
                break;
            case CLASSES:
                System.out.println("Tasks from 12 to 17");
                break;
            case CONDITIONS:
                System.out.println("Tasks from 18 to 31");
                break;
            case LOOPS:
                System.out.println("Tasks from 32 to 46");
                break;
            case OOP:
                System.out.println("Tasks from 47 to 50");
                break;
            case STRINGS:
                System.out.println("Tasks from 51 to 68");
                break;
            case COLLECTIONS:
                System.out.println("Tasks from 69 to 72");
                break;
        }
        int[] startEnd = new int[2];
    }


    public void TASK_1() {
        System.out.println("Enter one integer: ");
        int num1 = sc.readInt();
        System.out.println("Result: " + Task1.doubleInteger(num1));
    }
    public void TASK_2() {
        System.out.println("Enter two numbers: ");
        int num1 = sc.readInt();
        int num2 = sc.readInt();
        System.out.println("Result: " + task2.multiply(num1, num2));
    }
    public void TASK_3() {
        System.out.println("Enter the length, width and the height: ");
        System.out.println("Enter the length: ");
        double length = doublePositive(sc.readDouble());
        System.out.println("Enter the width: ");
        double width = doublePositive(sc.readDouble());
        System.out.println("Enter the height: ");
        double height = doublePositive(sc.readDouble());
        System.out.println("Result: " + Task3.getVolumeOfCuboid(length, width, height));
    }
    public void TASK_4() {
        System.out.println("Enter the wallLength and pixelSize : ");
        int wallLength = intPositive(sc.readInt());
        int pixelSize = intPositive(sc.readInt());
        System.out.println("Result: " + Task4.isDivisible( wallLength,pixelSize));
    }
    public void TASK_5() {
        System.out.println("Enter the name to greet: ");
        String name = sc.readString();
        System.out.println("Result: " + Task5.greet(name));
    }
    public void TASK_6(){
        System.out.println("Enter non-negative integer n: ");
        int n = intPositive(sc.readInt());
        System.out.println("Result: " + Task6.toBinary(n));
    }
    public void TASK_7(){
        System.out.println("Enter hour, minute and seconds: ");
        System.out.println("Enter hour: ");
        int hour = intPositive(sc.readInt());
        System.out.println("Enter minute: ");
        int minute = intPositive(sc.readInt());
        System.out.println("Enter seconds: ");
        int seconds = intPositive(sc.readInt());
        System.out.println("Result: " + Task7.Past(hour,minute,seconds));
    }
    public void TASK_8() {
        System.out.println("Enter the number : ");
        int num = sc.readInt();
        System.out.println("Result: " + Task8.century(num));
    }
    public void TASK_9() {
        System.out.println("Enter the number : ");
        int num = sc.readInt();
        System.out.println("Result: " + Task9.makeNegative(num));
    }
    public void TASK_10() {
        System.out.println("Enter age: ");
        int age = intPositive(sc.readInt());
        System.out.println("Result: " + Task10.datingRange(age));
    }
    public void TASK_11(){
        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = intPositive(sc.readInt());
        System.out.println("Result: " + Task11.convertToCelsius(fahrenheit));
    }
    public void TASK_12() {
        System.out.println("Result: " + new Task12());
    }

    public void TASK_13() {
        Task13 instance = new Task13();
        System.out.println("Enter the number : ");
        int num = sc.readInt();
        System.out.println("Result: " + instance.plus100(num));
    }

    public void TASK_14(){
        System.out.println("Enter numerator: ");
        int numerator = intPositive(sc.readInt());
        System.out.println("Enter denominator: ");
        int denominator = intPositive(sc.readInt());
        System.out.println(Task14.add(new Task14(numerator, denominator)));
    }
    public void TASK_15(){
        int x = intPositive(sc.readInt());

    }
    public void TASK_16() {
        System.out.println("Enter the Figter1 name health damagePerAttack : ");
        String name = sc.readString();
        int health = intPositive(sc.readInt());
        int damagePerAttack = intPositive(sc.readInt());
        Task16.Fighter f1= new Task16.Fighter(name, health, damagePerAttack);
        System.out.println("Enter the Figter2 name health damagePerAttack : ");
        name = sc.readString();
        health = intPositive(sc.readInt());
        damagePerAttack = intPositive(sc.readInt());
        Task16.Fighter f2= new Task16.Fighter(name, health, damagePerAttack);
        System.out.println("Enter the firstAttacker name : ");
        name = sc.readString();
        System.out.println("Winner: " + Task16.declareWinner(f1,f2,name));
    }
    public void TASK_17() {
        System.out.println("Enter the length, width and the height: ");
        int[] input = new int[3];
        input[0] = intPositive(sc.readInt());
        input[1] = intPositive(sc.readInt());
        input[2] = intPositive(sc.readInt());
        Task17 instance = new Task17(input);
        System.out.println("Volume of block: " + instance.getVolume() + "\n"
                + "Surface area:" + instance.getSurfaceArea());
    }
    public void TASK_18() {
        System.out.println("Enter 1 number: ");
        int num = sc.readInt();
        System.out.println("Result: " + Task18.opposite(num));
    }
    public void TASK_19() {
        System.out.println("Enter number n, x and y: ");
        System.out.println("Enter number n: ");
        long n = longPositive(sc.readLong());
        System.out.println("Enter number x: ");
        long x = longPositive(sc.readLong());
        System.out.println("Enter number y: ");
        long y = longPositive(sc.readLong());
        System.out.println("Result: " + Task19.isDivisible(n, x, y));
    }
    public void TASK_20() {
        System.out.println("Enter the number : 1-true 2-false");
        if(intPositive(sc.readInt())==1)
            System.out.println("Result: " + Task20.convert(true));
        else
            System.out.println("Result: " + Task20.convert(false));
    }
    public void TASK_21() {
        System.out.println("Enter the salary:");
        int salary = intPositive(sc.readInt());
        boolean bonus;
        System.out.println("Do we get a bonus? Enter the number : 1-true 2-false");

        if(intPositive(sc.readInt())==1) {
            bonus = true;
        } else {
            bonus = false;
        }

        System.out.println("Result: " + Task21.bonusTime(salary,bonus));
    }
    public void TASK_22() {
        System.out.println("Enter the year of birth:");
        int yearOfBirth = intPositive(sc.readInt());
        System.out.println("Enter the year to count years in relation to: ");
        int yearToCount = intPositive(sc.readInt());
        System.out.println("Result: " + Task22.CalculateAge(yearOfBirth, yearToCount));
    }
    public void TASK_23() {
        System.out.println("Enter \"paper\" or\"rock\" or \"scissors\" for two players:");
        System.out.println("Enter for first player: ");
        String player1 = sc.readString();
        System.out.println("Enter for second player: ");
        String player2 = sc.readString();
        System.out.println("Result: " + Task23.rps(player1, player2));
    }
    public void TASK_24() {
        System.out.println("Enter the opperand and two numbers : ");
        String op=sc.readString();
        int num1 = intPositive(sc.readInt());
        int num2 = intPositive(sc.readInt());
        System.out.println("Result: " + Task24.basicMath(op,num1,num2));
    }
    public void TASK_25() {
        System.out.println("Enter the number of petals in flower one:");
        int flo1 = intPositive(sc.readInt());
        System.out.println("Enter the number of petals in flower two:");
        int flo2 = intPositive(sc.readInt());
        System.out.println("Result: " + Task25.isLove(flo1,flo2));
    }
    public void TASK_26() {
        System.out.println("Enter a boolean value:");
        boolean value = sc.readBoolean();
        System.out.println("Result: " + Task26.boolToWord(value));
    }
    public void TASK_27() {
        System.out.println("Enter a \"cap\" - is the amount of people the bus can hold excluding the driver\n" +
                "\"on\" - is the number of people on the bus excluding the driver\n" +
                "\"wait\" is the number of people waiting to get on to the bus excluding the driver");
        System.out.println("Enter amount of people the bus can hold:");
        int cap = intPositive(sc.readInt());
        System.out.println("Enter number of people on the bus:");
        int on = intPositive(sc.readInt());
        System.out.println("Enter number of people waiting to get on to the bus:");
        int wait = intPositive(sc.readInt());
        System.out.println("Result: " + Task27.enough(cap, on, wait));
    }
    public void TASK_28() {
        System.out.println("Enter the number : ");
        int num1 = intPositive(sc.readInt());
        System.out.println("Result: " + Task28.sequence(num1));
    }
    public void TASK_29() {
        int num = -1;
        while (num > 9 || num < 0) {
            System.out.println("Please enter number between 0 and 9");
            num = sc.readInt();
        }
        System.out.println("Result: " + Task29.switchItUp(num));
    }
    public void TASK_30() {
        System.out.println("Enter a color of green/yellow/red: ");
        String color = sc.readString();
        System.out.println("Result: " + Task30.updateLight(color));
    }
    public void TASK_31() {
        System.out.println("Enter number of days: ");
        int days = intPositive(sc.readInt());
        System.out.println("Result: " + Task31.rentalCarCost(days)+"$");
    }
    public void TASK_32() {
        System.out.println("Enter the string and num of repeats : ");
        String s = sc.readString();
        int num1 = intPositive(sc.readInt());
        System.out.println("Result: " + Task32.repeatStr(num1,s));
    }
    public void TASK_33() {
        System.out.println("Enter the human years: ");
        int years = intPositive(sc.readInt());
        System.out.println("Result: " + Arrays.toString(Task33.humanYearsCatYearsDogYears(years)));
    }
    public void TASK_34() {
        System.out.println("Enter an array with your averages: ");
        int[] array = intArrayPositive(sc.readIntArray());
        System.out.println("Result: " + Task34.getAverage(array));
    }
    public void TASK_35() {
        System.out.println("Enter an array of int: ");
        int[] arr = intArrayPositive(sc.readIntArray());
        System.out.println("Result: " + Arrays.toString(Task35.map(arr)));
    }
    public void TASK_36() {
        System.out.println("Enter an array of sheep where some sheep may be missing from their place: ");
        Boolean[] array = sc.readBooleanArray();
        System.out.println("Result: " + Task36.countSheeps(array));
    }
    public void TASK_37() {
        System.out.println("Enter positive int number: ");
        int a = intPositive(sc.readInt());
        System.out.println("Result " + Arrays.toString(Task37.reverse(a)));
    }
    public void TASK_38() {
        System.out.println("Enter an array with your peers' test scores: ");
        int[] array = intArrayPositive(sc.readIntArray());
        System.out.println("Enter your point: ");
        int yourPoints = intPositive(sc.readInt());
        System.out.println("Result: " + Task38.betterThanAverage(array, yourPoints));
    }
    public void TASK_39() {
        System.out.println("Enter an array of int numbers: ");
        int[] arr = intArrayPositive(sc.readIntArray());
        System.out.println("Result: " + Task39.grow(arr));
    }
    public void TASK_40() {
        System.out.println("Enter the int arr : ");
        int []arr = sc.readIntArray();
        System.out.println("Result: "+ Task40.sum(arr));
    }
    public void TASK_41() {
        System.out.println("Enter the string arr: ");
        String[] array = sc.readStringArray();
        System.out.println("Result: "+ Arrays.toString(Task41.fixTheMeerkat(array)));
    }
    public void TASK_42() {
        System.out.println("Enter current father's age (years): ");
        int fatherAge = intPositive(sc.readInt());
        System.out.println("Enter current age of his son (years): ");
        int sonAge = intPositive(sc.readInt());
        System.out.println("Result: " + Task42.TwiceAsOld(fatherAge, sonAge));
    }
    public void TASK_43() {
        System.out.println("Enter the int number : ");
        int number = intPositive(sc.readInt());
        System.out.println("Result: " + Task43.nearestSq(number));
    }
    public void TASK_44() {
        System.out.println("Enter the number : ");
        int arr = sc.readInt();
        System.out.println("Result: "+ Task44.summation(arr));
    }
    public void TASK_45() {
        System.out.println("Enter the number gap in primes, we are looking for, start number and end number of the search: ");
        int g = intPositive(sc.readInt());
        int m = intPositive(sc.readInt());
        int n = intPositive(sc.readInt());
        System.out.println("Result: "+ Arrays.toString(Task45.gap(g,m,n)));
    }
    public void TASK_46() {
        System.out.println("Enter count of sticks(1/2/3): ");
        int countOfStiks = intPositive(sc.readInt());
        System.out.println("Result: " + Task46.makeMove(countOfStiks));
    }
    public void TASK_47() {}
    public void TASK_48() {
        Task48 r = IDENTITY;
        System.out.println("you have IDENTITY object select an action:\n 1- inv() \n2-is_rotation()\n3-is_reflection()" +
                "\n4-then(REFLECT_FORWARD_DIAGONAL)\n");
        switch(sc.readInt()){
            case 1:
                System.out.println(r.inv().toString());
                break;
            case 2:  System.out.println(r.is_rotation());
                break;
            case 3: System.out.println(r.is_reflection());
                break;
            case 4: System.out.println(r.then(REFLECT_FORWARD_DIAGONAL).toString()); ;
                break;


        }

    }

    public void TASK_49() {
        Task49 encoder = new Task49();
        System.out.println("Enter the string u want to encode: ");
        String input = sc.readString();
        System.out.println("Result: " + encoder.encode(input));
    }
    public void TASK_51() {
        System.out.println("Enter a number: ");
        int number = intPositive(sc.readInt());
        System.out.println("Result: " + Task51.numberToString(number));
    }
    public void TASK_52() {
        System.out.println("Enter the string : ");
        String a = sc.readString();
        System.out.println("Result: "+ Task52.solution(a));
    }

    public void TASK_53() {
        System.out.println("Enter the array of names to say hello: ");
        String[] names = sc.readStringArray();
        System.out.println("Enter the city: ");
        String city = sc.readString();
        System.out.println("Enter the state: ");
        String state = sc.readString();
        System.out.println(" Result: " + Task53.sayHello(names,city,state));
    }

    public void TASK_55() {
        System.out.println("Enter few dots \".\": ");
        String dotsStr = sc.readString();
        System.out.println("Result: " + Task55.replaceDots(dotsStr));
    }
    public void TASK_56() {
        System.out.println("Enter the name : ");
        String a = sc.readString();
        System.out.println("Result: "+ Task56.areYouPlayingBanjo(a));
    }
    public void TASK_57() {
        System.out.println("Enter string:");
        String a = sc.readString();
        System.out.println("Result: "+ Task57.noSpace(a));
    }
    public void TASK_58() {
        System.out.println("Enter the first string: ");
        String first = sc.readString();
        System.out.println("Enter the second string: ");
        String second = sc.readString();
        System.out.println("Enter the third string: ");
        String third = sc.readString();
        if (first.length() == second.length() && second.length() == third.length() && first.length() == third.length())
            System.out.println("Result: " + Task58.tripleTrouble(first, second, third));
        else {
            System.out.println("Length of strings are different");
        }
    }
    public void TASK_59() {
        System.out.println("Enter a letter: ");
        char letter = sc.readChar();
        System.out.println("Result: " + Task59.position(letter));
    }
    public void TASK_60() {
        System.out.println("Enter the string : ");
        String a = sc.readString();
        System.out.println("Result: "+ Task60.fakeBin(a));
    }
    public void TASK_61() {
        System.out.println(" Enter string like: \"x years old\", where x is a random number between 0 and 9.");
        String a = sc.readString();
        System.out.println("Result: "+ Task61.howOld(a));
    }
    public void TASK_62() {
        System.out.println("Enter a temperature: ");
        int temperature = sc.readInt();
        System.out.println("Result: " + Task62.weatherInfo(temperature));
    }
    public void TASK_63() {
        System.out.println("Enter the name example \"Sam Harris\": ");
        String name = sc.readString();
        System.out.println("Result: " + Task63.abbrevName(name));
    }
    public void TASK_64() {
        System.out.println("Enter the string and char: ");
        String a = sc.readString();
        char c = sc.readString().charAt(0);
        System.out.println("Result: "+ Task64.strCount(a,c));
    }
    public void TASK_65() {
        System.out.println("Enter some words: ");
        String[] array = sc.readStringArray();
        System.out.println("Result: " + Task65.twoSort(array));
    }
    public void TASK_66() {
        System.out.println("Enter a sentence: ");
        String string = sc.readString();
        System.out.println("Result: " + Task66.correct(string));
    }
    public void TASK_67() {
        System.out.println("Enter the string with upper and lower case: ");
        String str = sc.readString();
        System.out.println("Result: " + Task67.toAlternativeString(str));
    }
    public void TASK_68() {
        System.out.println("Enter the string with '!' and number: ");
        String a = sc.readString();
        int n = intPositive(sc.readInt());
        System.out.println("Result: "+ Task68.remove(a,n));
    }
    public void TASK_69() {
        System.out.println(" Do u want 2 push a hash/an object into array? " +
                "Enter the number : 1-yes 2-no");
        boolean yes;
        if(intPositive(sc.readInt())==1) {
            yes = true;
        } else {
            yes = false;
        }
        if (yes) {
            System.out.println("You pushed an object into array! Now your array size is: " + Task69.push().size());
        } else {
            System.out.println("Well, as u want");
        }
    }
    public void TASK_70() {
        System.out.println("Enter a number: ");
        int number = intPositive(sc.readInt());
        System.out.println("Result: " + Task70.CreateList(number));
    }
    public void TASK_71() {
        System.out.println("Enter int numbers: ");
        List<Integer> list = Collections.singletonList(intPositive(sc.readInt()));
        System.out.println("Result: " + Task71.filterOddNumber(list));
    }
    public void TASK_72() {
        System.out.println("Enter the key : ");
        String k = sc.readString();
        System.out.println("Enter the value : ");
        String v = sc.readString();
        Task72 o= new Task72();
        o.newEntry(k,v);
        System.out.println("Enter the search key: ");
        k = sc.readString();
        System.out.println("Result: "+ o.look(k));
    }


    private int intPositive(int num) {
        while (num <= 0) {
            System.out.println("Please enter number > 0");
            num = sc.readInt();
        }
        return num;
    }

    private float floatPositive(float number) {
        while (number <= 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readFloat();
        }
        return number;
    }

    private int[] intArrayPositive(int[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] <= 0) {
                System.out.println("Please enter all numbers >= 0");
                number = sc.readIntArray();
            }
        }
        return number;
    }

    private int intNotZero(int number) {
        while (number == 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readInt();
        }
        return number;
    }

    private long longPositive(long number) {
        while (number <= 0) {
            System.out.println("Please enter number > 0");
            number = sc.readLong();
        }
        return number;
    }

    double doublePositiveOrNull(double number) {
        while (number < 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readDouble();
        }
        return number;
    }

    private double[] doubleArrayPositive(double[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] <= 0) {
                System.out.println("Please enter all numbers >= 0");
                number = sc.readDoubleArray();
            }
        }
        return number;
    }

    private double doublePositive(double number) {
        while (number <= 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readDouble();
        }
        return number;
    }

    public void setTasks(int number) {
        switch (number) {
            case 1:
                TASK_1();
                break;
            case 2:
                TASK_2();
                break;
            case 3:
                TASK_3();
                break;
            case 5:
                TASK_5();
                break;
            case 6:
                TASK_6();
                break;
            case 7:
                TASK_7();
                break;
            case 8:
                TASK_8();
                break;
            case 9:
                TASK_9();
                break;
            case 10:
                TASK_10();
                break;
            case 11:
                TASK_11();
                break;
            case 12:
                TASK_12();
                break;
            case 13:
                TASK_13();
                break;
            case 14:
                TASK_14();
                break;
            case 16:
                TASK_16();
                break;
            case 17:
                TASK_17();
                break;
            case 18:
                TASK_18();
                break;
            case 20:
                TASK_20();
                break;
            case 19:
                TASK_19();
                break;
            case 21:
                TASK_21();
                break;
            case 22:
                TASK_22();
                break;
            case 24:
                TASK_24();
                break;
            case 23:
                TASK_23();
                break;
            case 25:
                TASK_25();
                break;
            case 26:
                TASK_26();
                break;
            case 28:
                TASK_28();
                break;
            case 27:
                TASK_27();
                break;
            case 29:
                TASK_29();
                break;
            case 30:
                TASK_30();
                break;
            case 31:
                TASK_31();
                break;
            case 32:
                TASK_32();
                break;
            case 33:
                TASK_33();
                break;
            case 34:
                TASK_34();
                break;
            case 35:
                TASK_35();
                break;
            case 36:
                TASK_36();
                break;
            case 37:
                TASK_37();
                break;
            case 38:
                TASK_38();
                break;
            case 39:
                TASK_39();
                break;
            case 40:
                TASK_40();
                break;
            case 41:
                TASK_41();
                break;
            case 42:
                TASK_42();
                break;
            case 43:
                TASK_43();
                break;
            case 44:
                TASK_44();
                break;
            case 45:
                TASK_45();
                break;
            case 46:
                TASK_46();
                break;
            case 48:
                TASK_48();
                break;
            case 49:
                TASK_49();
                break;
            case 51:
                TASK_51();
                break;
            case 52:
                TASK_52();
                break;
            case 53:
                TASK_53();
                break;
            case 54:
                TASK_18();
                break;
            case 55:
                TASK_55();
                break;
            case 56:
                TASK_56();
                break;
            case 57:
                TASK_57();
                break;
            case 58:
                TASK_58();
                break;
            case 59:
                TASK_59();
                break;
            case 60:
                TASK_60();
                break;
            case 61:
                TASK_61();
                break;
            case 62:
                TASK_62();
                break;
            case 63:
                TASK_63();
                break;
            case 64:
                TASK_64();
                break;
            case 65:
                TASK_65();
                break;
            case 66:
                TASK_66();
                break;
            case 67:
                TASK_67();
                break;
            case 68:
                TASK_68();
                break;
            case 69:
                TASK_69();
                break;
            case 70:
                TASK_70();
                break;
            case 71:
                TASK_71();
                break;
            case 72:
                TASK_72();
                break;
        }
    }

}
