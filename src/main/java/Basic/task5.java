package Basic;

public class task5 {
    public static String greet(String name) {

        if (name.toLowerCase().equals("johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }

    public static void main(String[] args) {
        System.out.println(greet("JOhNny"));
    }
}
