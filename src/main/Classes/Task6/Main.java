package main.Classes.Task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        Block b = new Block(new int[]{width, length, height});
        System.out.println("Width: "+b.getWidth()); // -> 2
        System.out.println("Length: "+b.getLength()); // -> 4
        System.out.println("Height "+b.getHeight()); // -> 6
        System.out.println("V="+b.getVolume()); // -> 48
        System.out.println("S="+b.getSurfaceArea()); // -> 88
    }

}
