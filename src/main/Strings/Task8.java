package main.Strings;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter a string 3 times");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        System.out.println("Result is:");
        System.out.println(Task8.tripleTrouble(string1,string2,string3));
    }
    public static String tripleTrouble(String s1, String s2, String s3) {
        String s = "";
        for (int i = 0; i < s1.length(); i++){
            s += "" + s1.charAt(i) + s2.charAt(i) + s3.charAt(i);
        }
        return s;
    }
}
