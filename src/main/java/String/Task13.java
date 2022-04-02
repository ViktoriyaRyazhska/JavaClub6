package String;

/**   Task 13
 * @author MichaelShv*/

public class Task13 {
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] names = name.split(" ");
        return names[0].charAt(0)+"."+names[1].charAt(0);
    }
}
