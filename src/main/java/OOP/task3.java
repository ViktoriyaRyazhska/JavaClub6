package OOP;

public class task3 {

    public String encode(String str) {
        // a -> 4
        // e -> 3
        // l -> 1
        // m -> /^^\
        // o -> 0
        // u -> (_)
        // null -> empty

        return str == null ? ""
                : str.replaceAll("[aA]", "4").replaceAll("[eE]", "3")
                        .replaceAll("[lL]", "1").replaceAll("[mM]", "/^^\\\\")
                        .replaceAll("[oO]", "0").replaceAll("[uU]", "(_)");

    }

    public static void main(String[] args) {
        task3 str = new task3();
        System.out.println(str.encode("a el mou AA Ee"));
    }

}

abstract class Encoder {
    public abstract String encode(String str);
}
