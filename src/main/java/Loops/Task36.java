package Loops;

public class Task36 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int b=0;
        for(int i=0;i<arrayOfSheeps.length;i++){
            if(arrayOfSheeps[i]==true) b++;
        }
        return b;
    }
}