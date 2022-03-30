package Loops;

public class Task12 {
//    https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java

    public static void main(String[] args) {
//        System.out.println(121 + " " + nearestSq(111));
    }

    public static int nearestSq(final int n) {
        int result = 0;
        int counter = 0;
        while (result == 0) {
            double sqrt = Math.sqrt(n + counter);
            if (sqrt % 1 == 0) {
                result= n + counter;
            }
            sqrt = Math.sqrt(n - counter);
            if(sqrt % 1 == 0) {
                result= n - counter;
            }
            counter++;
        }
        return result;
    }
}
