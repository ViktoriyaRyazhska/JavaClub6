package String;

public class Task3 {

    public static String sayHello(String[] name, String city, String state) {

        return String.format("Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!");
    }
}
