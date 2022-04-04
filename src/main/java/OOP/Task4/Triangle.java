package OOP.Task4;

import OOP.Task4.Task4;

public class Triangle extends Task4 {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // areaOfATriangleIsBaseMultipliedByHeight
    @Override
    public double getTotalArea() {
        return (base * height) / 2;
    }
}
