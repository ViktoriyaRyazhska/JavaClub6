package OOP.Task4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task4 {

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

    public double getTotalArea(Task4... c) {
        double sum = 0;
        for (int i = 0; i < c.length; ++i) {
            sum += c[i].getTotalArea();
        }
        return sum;
    }
}

