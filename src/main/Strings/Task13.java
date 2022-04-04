package main.Strings;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Enter your full name ");
        String nameToBeConverted = scanner.next();
        System.out.println("Result is:");
        System.out.println(Task13.abbrevName(nameToBeConverted));
    }
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] names = name.split(" ");
        return names[0].charAt(0)+"."+names[1].charAt(0);
    }
}
