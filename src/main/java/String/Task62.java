package String;

public class Task62 {
    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c <= 0) return (c + " is freezing temperature");
        else return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        return (temperature - 32) * 5/9.0;
    }
}
