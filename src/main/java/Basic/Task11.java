package Basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task11 {
    // https://www.codewars.com/kata/55cb854deb36f11f130000e1/train/java

    public static void main(String[] args) {
        System.out.println("10.0 is above freezing temperature" + " " + weatherInfo(70));
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        BigDecimal bd = BigDecimal.valueOf((temperature - 32) * (5.0 / 9.0));
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
