package OOP.Task4;

public class Square extends Task4 {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // areaOfASquareIsSquareOfSide
    @Override
    public double getTotalArea() {
        return side * side;
    }
}
