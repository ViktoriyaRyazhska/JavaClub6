package Loops;

public class Task39 {
    public static int grow(int[] x){
        int count = 1;
        for(int i=0; i<x.length;i++){
            count = count * x[i];
        }

        return count;

    }}
