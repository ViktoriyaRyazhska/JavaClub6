package main.Collections.Task4;

public class Task4 {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "A fruit that grows on trees");
        System.out.println(d.look("Apple"));
        System.out.println(d.look("Banana"));
    }

}
