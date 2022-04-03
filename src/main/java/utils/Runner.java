package utils;
import Basic.*;
import Classes.*;
import Collections.*;
import Conditions.*;
import Loops.*;
import String.*;

public class Runner {
    private ConsoleScanner sc;
    public Runner() {
        sc = new ConsoleScanner();
    }
    public void TASK_2(){
        System.out.println("Enter two numbers: ");
        int num1 = sc.readInt();
        int num2 = sc.readInt();
        System.out.println("Result: " + task2.multiply(num1, num2));
    }
    public void TASK_3() {
        System.out.println("Enter the length, width and the height: ");
        double length = doublePositive(sc.readDouble());
        double width = doublePositive(sc.readDouble());
        double height = doublePositive(sc.readDouble());
        System.out.println("Result: " + Task3.getVolumeOfCuboid(length,width,height));
    }
    public void TASK_6(){
        System.out.println("Enter non-negative integer n: ");
        int n = intPositive(sc.readInt());
        System.out.println("Result: " + Task6.toBinary(n));
    }

    public void TASK_7(){
        System.out.println("Enter hour, minute and seconds: ");
        int hour = intPositive(sc.readInt());
        int minute = intPositive(sc.readInt());
        int seconds = intPositive(sc.readInt());
        System.out.println("Result: " + Task7.Past(hour,minute,seconds));
    }

    public void TASK_4() {
        System.out.println("Enter the wallLength and pixelSize : ");
        int wallLength = intPositive(sc.readInt());
        int pixelSize = intPositive(sc.readInt());
        System.out.println("Result: " + Task4.isDivisible( wallLength,pixelSize));
    }
    public void TASK_8() {
        System.out.println("Enter the number : ");
        int num = intPositive(sc.readInt());
        System.out.println("Result: " + Task8.century(num));
    }
    public void TASK_10(){
        System.out.println("Enter age: ");
        int age = intPositive(sc.readInt());
        System.out.println("Result: " + Task10.datingRange(age));
    }
    public void TASK_12() {
        System.out.println("Result: " + new Task12());
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
    public void TASK_18(){
        System.out.println("Enter 1 number: ");
        int num = sc.readInt();
        System.out.println("Result: " + Task18.opposite(num));
    }
    public void TASK_20() {
        System.out.println("Enter the number : 1-true 2-false");
        if(intPositive(sc.readInt())==1)
            System.out.println("Result: " + Task20.convert(true));
        else
            System.out.println("Result: " + Task20.convert(false));
    }
    public void TASK_22(){
        System.out.println("Enter the year of birth:");
        int yearOfBirth = intPositive(sc.readInt());
        System.out.println("Enter the year to count years in relation to: ");
        int yearToCount = intPositive(sc.readInt());
        System.out.println("Result: " + Task22.CalculateAge(yearOfBirth, yearToCount));
    }
    public void TASK_24() {
        System.out.println("Enter the opperand and two numbers : ");
        String op=sc.readString();
        int num1 = intPositive(sc.readInt());
        int num2 = intPositive(sc.readInt());
        System.out.println("Result: " + Task24.basicMath(op,num1,num2));
    }
    public void TASK_26(){
        System.out.println("Enter a boolean value:");
        boolean value = sc.readBoolean();
        System.out.println("Result: " + Task26.boolToWord(value));
    }
    public void TASK_28() {
        System.out.println("Enter the number : ");
        int num1 = intPositive(sc.readInt());
        System.out.println("Result: " + Task28.sequence(num1));
    }

    public void TASK_30(){
        System.out.println("Enter a color of green/yellow/red: ");
        String color = sc.readString();
        System.out.println("Result: " + Task30.updateLight(color));
    }
    public void TASK_32() {
        System.out.println("Enter the string and num of repeats : ");
        String s = sc.readString();
        int num1 = intPositive(sc.readInt());
        System.out.println("Result: " + Task32.repeatStr(num1,s));
    }
    public void TASK_34(){
        System.out.println("Enter an array with your averages: ");
        int[] array = intArrayPositive(sc.readIntArray());
        System.out.println("Result: " + Task34.getAverage(array));
    }
    public void TASK_36() {}
    public void TASK_38(){
        System.out.println("Enter an array with your peers' test scores: ");
        int[] array = intArrayPositive(sc.readIntArray());
        System.out.println("Enter your point: ");
        int yourPoints = intPositive(sc.readInt());
        System.out.println("Result: " + Task38.betterThanAverage(array, yourPoints));
    }
    public void TASK_40() {
        System.out.println("Enter the int arr : ");
        int []arr = sc.readIntArray();
        System.out.println("Result: "+ Task40.sum(arr));
    }
    public void TASK_44() {
        System.out.println("Enter the number : ");
        int arr = sc.readInt();
        System.out.println("Result: "+ Task44.summation(arr));
    }
    public void TASK_48() {}
    public void TASK_52() {
        System.out.println("Enter the string : ");
        String a = sc.readString();
        System.out.println("Result: "+ Task52.solution(a));
    }
    public void TASK_56() {
        System.out.println("Enter the name : ");
        String a = sc.readString();
        System.out.println("Result: "+ Task56.areYouPlayingBanjo(a));
    }
    public void TASK_60() {
        System.out.println("Enter the string : ");
        String a = sc.readString();
        System.out.println("Result: "+ Task60.fakeBin(a));
    }
    public void TASK_64() {
        System.out.println("Enter the string and char: ");
        String a = sc.readString();
        char c = sc.readString().charAt(0);
        System.out.println("Result: "+ Task64.strCount(a,c));
    }
    public void TASK_68() {
        System.out.println("Enter the string with '!' and number: ");
        String a = sc.readString();
        int n = intPositive(sc.readInt());
        System.out.println("Result: "+ Task68.remove(a,n));
    }
    public void TASK_72() {
        System.out.println("Enter the key and value for: ");
        String k = sc.readString();
        String v = sc.readString();
        Task72 o = new Task72();
        o.newEntry(k,v);
        System.out.println("Enter the search key: ");
        k = sc.readString();
        System.out.println("Result: "+ o.look(k));
    }

    public void TASK_11(){
        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = intPositive(sc.readInt());
        System.out.println("Result: " + Task11.convertToCelsius(fahrenheit));
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
            case 2:
                TASK_2();
                break;
            case 3:
                TASK_3();
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
            case 10:
                TASK_10();
                break;
            case 18:
                TASK_18();
                break;
            case 22:
                TASK_22();
                break;
            case 26:
                TASK_26();
                break;
            case 30:
                TASK_30();
                break;
            case 34:
                TASK_34();
                break;
            case 38:
                TASK_38();
                break;
        }
    }
}
