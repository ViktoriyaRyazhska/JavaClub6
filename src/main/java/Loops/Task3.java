package Loops;

public class Task3 {
    public static int getAverage(int[] marks){
        int count = marks.length;
        int summ = 0;
        for (int mark : marks) {
            summ += mark;
        }
        return (summ / count);
    }
}
