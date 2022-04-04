package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class OOPTask51 {

    public static class Calculator {
        ArrayList<Double> list = new ArrayList<>();
        public void calc(Scanner scanner){
            while (true){
                chooseShapeToCalc(scanner);
            }
        }
        public void chooseShapeToCalc(Scanner scanner) {
            System.out.println("Choose shapes:");
            System.out.println("Triangle - 1");
            System.out.println("Circle-2");
            System.out.println("Rectangle-3");
            System.out.println("Square-4");
            System.out.println("Count sum of areas -0");
            int shape = scanner.nextInt();
            switch (shape) {
                case 1:
                    list.add(new Triangle().calculateArea());
                    break;

                case 2:
                    list.add(new Circle().calculateArea());
                    break;
                case 3:
                    list.add(new Rectangle().calculateArea());
                    break;
                case 4:
                    list.add(new Square().calculateArea());
                    break;
                case 0:
                    System.out.println(sumOfArea());
                    System.exit(0);
                default:


            }
        }

        public double sumOfArea() {
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.print("Sum of areas=");
            return sum;
        }
    }
}

interface Shape {
    double calculateArea();
}

class Square implements Shape {

    public double calculateArea() {
        System.out.print("Square: side=  ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        return side * side;
    }
}

class Rectangle implements Shape {

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rectangle: height= ");
        double height = scanner.nextDouble();
        System.out.println("Rectangle: width= ");
        double width = scanner.nextDouble();
        return height * width;
    }
}

class Circle implements Shape {

    public double calculateArea() {
        System.out.println("Circle: r=");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        return radius * radius * 3.14;
    }
}

class Triangle implements Shape {

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle: base= ");
        double triangleBase = scanner.nextDouble();
        System.out.println("Triangle: height= ");
        double triangleHeight = scanner.nextDouble();
        return (triangleBase * triangleHeight) / 2;
    }

}
