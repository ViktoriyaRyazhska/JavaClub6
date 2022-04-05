package Classes;

import java.util.Scanner;

public class ClassTask17 {
    private final int width;
    private final int length;
    private final int height;

    public ClassTask17(int... corners) {
        this.width = corners[0];
        this.length = corners[1];
        this.height = corners[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        return 2 * (length * height + length * width + height * width);
    }

    public void result(Scanner scanner) {
        System.out.println("Write a class Block that creates a block (Duh..)\n" +
                "\n" +
                "##Requirements\n" +
                "\n" +
                "The constructor should take an array as an argument, this will contain 3 integers" +
                " of the form [width, length, height] from which the Block should be created.");
        System.out.println("Data of [width, length, height]=");
            int width=scanner.nextInt();
            int length=scanner.nextInt();
            int height=scanner.nextInt();
            System.out.println("result="+2 * (length * height + length * width + height * width));
        }
    }

