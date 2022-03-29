public class Task17 {
    // https://www.codewars.com/kata/alternating-case-<-equals->-alternating-case/
    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello world"));
        System.out.println(toAlternativeString("Hello World"));
        System.out.println(toAlternativeString("12345"));
        System.out.println(toAlternativeString("1a2b3c4d5e"));
    }
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();
        for (char a : string.toCharArray()) {
            if (Character.isUpperCase(a)) {
                sb.append(Character.toLowerCase(a));
            } else {
                sb.append(Character.toUpperCase(a));
            }
        }
        return sb.toString();
    }
}
