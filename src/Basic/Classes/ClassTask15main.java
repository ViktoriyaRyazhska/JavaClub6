package Classes;

import java.util.Scanner;

public class ClassTask15main {
    public static void resTask15(Scanner scanner){
        System.out.println("You are going to write a simple console-style drawing board program.\n" +
                "The drawing board is very simple so only these functions are supported:\n"+
                "Create canvas,Draw line / rectangle,Fill color\n"+
                "Implement the drawCanvas method to return the string contains the entire canvas\n"+
                " surrounded by borders with - and |.");
        System.out.print("Put the following data:\n width =");
        int width=scanner.nextInt();
        System.out.print("height=");
        int height=scanner.nextInt();
        System.out.print("Coordinates for drawing: x1=");
        int x1=scanner.nextInt();
        System.out.print("y1=");
        int y1=scanner.nextInt();
        System.out.print("x2=");
        int x2=scanner.nextInt();
        System.out.println("y2=");
        int y2=scanner.nextInt();
        System.out.print("Coordinates for filling by color: x= ");
        int x=scanner.nextInt();
        System.out.println("y=");
        int y=scanner.nextInt();
        new ClassTask15.Canvas(width,height).draw(x1,y1,x2,y2).drawCanvas();
    }

}
