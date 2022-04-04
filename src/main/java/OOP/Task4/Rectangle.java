package OOP.Task4;

public class Rectangle extends Task4 {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // areaOfARectangleIsWidthMultipliedByHeight
    @Override
    public double getTotalArea() {
        return height * width;
    }
}
