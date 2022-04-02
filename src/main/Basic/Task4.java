package main.Basic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Wall Length: ");
        int wallLength = scanner.nextInt();
        System.out.print("Enter Pixel size: ");
        int pixelSize = scanner.nextInt();
        System.out.println("Result - " +isDivisible(wallLength,pixelSize));

    }
    public static boolean isDivisible(int wallLength,int pixelSize){
        return wallLength % pixelSize == 0;
    }
}
