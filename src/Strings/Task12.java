public class Task12 {
    // https://www.codewars.com/kata/grasshopper-debug/
    public static void main(String[] args) {
        System.out.println(weatherInfo(50));
        System.out.println(weatherInfo(23));
    }
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = ((temperature - 32) * 5 / 9.0);
        return celsius;
    }
}
