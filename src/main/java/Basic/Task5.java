package Basic;

public class Task5 {
    public static String greet(String name) {

        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }
}