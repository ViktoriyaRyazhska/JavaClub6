public class Main {
    // https://www.codewars.com/kata/will-there-be-enough-space/
    public static void main(String[] args) {
        System.out.println(enough(10, 5, 5));
        System.out.println(enough(100, 60, 50));
    }

    public static int enough(int cap, int on, int wait) {
        return cap >= wait + on ? 0 : wait + on - cap;
    }

}
