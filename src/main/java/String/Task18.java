package String;

public class Task18 {
    public static String removeExclamationMarks(String string, int number){
        int i = 0;
        String result = "";
        while (i != string.length() - 1 || number != 0){
            if (string.charAt(i) == '!') {
                i++;
                number--;
                continue;
            }
            result += string.charAt(i);
            i++;
        }
        return result;
    }
}
