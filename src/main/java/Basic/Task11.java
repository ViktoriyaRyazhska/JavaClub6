package Basic;

public class Task11 {
//    https://www.codewars.com/kata/55cb854deb36f11f130000e1/train/java

    public static void main(String[] args) {
        System.out.println("10.0 is above freezing temperature" + " "+ weatherInfo(50));
    }
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (5/9.0);
        return celsius;
    }


}
