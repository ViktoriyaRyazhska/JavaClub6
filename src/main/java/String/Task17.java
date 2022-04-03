package String;

public class Task17 {
    public static String toAlternativeString(String string){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) < 91 && string.charAt(i) > 64) {
                result.append(Character.toString(string.charAt(i) + 32));
            } else if (string.charAt(i) < 123 && string.charAt(i) > 96){
                result.append(Character.toString(string.charAt(i) - 32));
            } else result.append(Character.toString(string.charAt(i)));
        }
        return result.toString();
    }
}
