package OOP.Task4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Task4 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // areaOfACircleIsSquareOfRadiusMulitpliedByPi
    @Override
    public double getTotalArea() {
        BigDecimal bd = BigDecimal.valueOf(radius * radius * 3.141);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
