package OOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task4 {

}

class Calculator {

    public double getTotalArea() {
        return 0;
    }

    public double getTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        double area1 = rectangle1.getTotalArea();
        double area2 = rectangle2.getTotalArea();

        BigDecimal bd = BigDecimal.valueOf(area1 + area2);
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }

    public double getTotalArea(Calculator...c) {
        double sum = 0;
        for (int i = 0; i < c.length; ++i) {
            sum += c[i].getTotalArea();
        }
        return sum;
    }
}

class Square extends Calculator{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    //areaOfASquareIsSquareOfSide
    @Override
    public double getTotalArea() {
        return side * side;
    }
}

class Triangle extends Calculator{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //areaOfATriangleIsBaseMultipliedByHeight
    @Override
    public double getTotalArea() {
        return (base * height) / 2;
    }
}

class Circle extends Calculator{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //areaOfACircleIsSquareOfRadiusMulitpliedByPi
    @Override
    public double getTotalArea() {
        BigDecimal bd = BigDecimal.valueOf(radius * radius * 3.141);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

class Rectangle extends Calculator{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //areaOfARectangleIsWidthMultipliedByHeight
    @Override
    public double getTotalArea() {
        return height * width;
    }
}


