package main.Loop;

public class Task3 {
    public static void main(String[] args) {System.out.println(getAverage(new int[]{1, 5, 4, 3}));}
        public static int getAverage(int[] marks){
        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++){
            sumOfMarks += marks[i];
        }
        return sumOfMarks/marks.length;
    }
}
