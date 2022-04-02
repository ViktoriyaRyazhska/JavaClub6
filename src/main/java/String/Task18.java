package String;

public class Task18 {
    public static String remove(String s, int n){
        String result = "";
        int k = n;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '!') {
                if (k > 0) {
                    k--;
                } else {
                    result += c;
                }
            } else {
                result += c;
            }
        }

        return result;
    }
}
