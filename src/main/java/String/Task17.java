package String;

public class Task17 {
//    https://www.codewars.com/kata/alternating-case-<-equals->-alternating-case/


    public static String toAlternativeString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            final char c = string.charAt(i);
            if(Character.isAlphabetic(c)){
                if(Character.isUpperCase(c)){
                    stringBuilder.append(Character.toLowerCase(c));
                }else {
                    stringBuilder.append(Character.toUpperCase(c));
                }
            }else{
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
