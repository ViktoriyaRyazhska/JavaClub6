package Loops;

public class Task3{

    public static int getAverage(int[] marks){

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return sum / marks.length;
    }

}
