package String;

public class Task57 {

    public static String noSpace(final String x) {
        String out = String.join("", x.split(" "));
        return out;
    }

}