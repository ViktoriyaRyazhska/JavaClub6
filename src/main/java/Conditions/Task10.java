package Conditions;

public class Task10 {
//    https://www.codewars.com/kata/5875b200d520904a04000003/train/java

    public static void main(String[] args) {
//        System.out.println("Should return 0.");
//        System.out.println(enough(10, 5, 5));
//
//        System.out.println("Should return 10.");
//        System.out.println(enough(100, 60, 50));
//
//        System.out.println("Should return 0.");
//        System.out.println(enough(20, 5, 5));
    }

    public static int enough(int cap, int on, int wait) {
        // your code here
        int i = cap - on;
        i = i - wait;
        i = Math.min(i, 0);
//                -wait
        return -i;
    }
}
