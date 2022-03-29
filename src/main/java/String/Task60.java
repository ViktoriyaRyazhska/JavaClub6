package String;

public class Task60 {
    public static String fakeBin(String numberString) {
        String res = "";

        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i)-'0' < 5) {
                res+="0";
            } else
                res+="1";
        }
        return res;
    }

}