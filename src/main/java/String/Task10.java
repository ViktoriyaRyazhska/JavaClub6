package String;

public class Task10 {
    public static String fakeBin(String numberString) {
        String result = "";

        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (c < '5') {
                result += "0";
            } else if (c >= '5') {
                result += "1";
            }
        }
        return result;
    }
}
