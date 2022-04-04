package OOP;

import java.util.Arrays;

public class OOPTask51 {

    public static class Calculator {
        public double getTotalArea(Shape... shapes) {
            double totalArea = Arrays.stream(shapes).mapToDouble(Shape::calculateArea).sum();
            return Math.round(totalArea * 100.0) / 100.0;
        }
    }

    interface Shape {
        double calculateArea();
    }

    static class Square implements Shape {
        private double side;
        public Square(double side) {
            this.side = side;
        }
        public double calculateArea() {
            return side * side;
        }
    }

    static class Rectangle implements Shape {
        private double height;
        private double width;
        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }
        public double calculateArea() {
            return height * width;
        }
    }

    static class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double calculateArea() {
            return radius * radius * Math.PI;
        }
    }

    static class Triangle implements Shape {
        private double triangleBase;
        private double triangleHeight;
        public Triangle(double triangleBase, double triangleHeight) {
            this.triangleBase = triangleBase;
            this.triangleHeight = triangleHeight;
        }
        public double calculateArea() {
            return (triangleBase * triangleHeight) / 2;
        }
    }
}