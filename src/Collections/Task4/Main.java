public class Main {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "A fruit that grows on trees");
        System.out.println(d.look("Apple"));
        System.out.println(d.look("Banana"));
    }

}
