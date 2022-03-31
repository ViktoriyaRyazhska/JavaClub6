package OOP;
/**   Task 4
 * @author wertylu*/
public class Task4 {
    public double getTotalArea(Figure...figure){
        double sum = 0;
        for(Figure i : figure){
            sum+=i.getArea();
        }
        sum = sum*100;
        sum = (int)Math.round(sum);
        sum = (double)sum/100;
        return sum;
    }
}




abstract class Figure{
    public abstract double getArea();
}


class Triangle extends Figure{
    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;

    }
    @Override
    public double getArea() {
        return base*height/2;
    }
}

class Square extends Figure {
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
}


class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}


class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }
}
