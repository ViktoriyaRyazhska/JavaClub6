package main.Strings;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(BanjoPlay("rodger"));
    }

    public static String BanjoPlay(String name) {
        if (name.startsWith("R") || name.startsWith("r")) {
            return (name + " plays banjo");
        } else return (name + " does not play banjo");
    }
}