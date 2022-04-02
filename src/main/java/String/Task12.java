package String;

/**   Task 12
 * @author MichaelShv*/

public class Task12 {
    public static String weatherInfo(int temp) {
        double c = (temp - 32.0) * (5.0/9.0);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }
}
