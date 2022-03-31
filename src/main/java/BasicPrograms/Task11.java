package BasicPrograms;
/**   Task 11
 * @author wertylu*/

public class Task11 {

    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32.0) *5/9;
        return celsius;
    }
}
