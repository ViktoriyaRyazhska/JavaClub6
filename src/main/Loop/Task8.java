package main.Loop;

public class Task8 {
    public static void main(String[] args){System.out.println(grow(new int[]{1, 2, 3, 4}));}
    public static int grow(int[] x){
        int result = x[0];
        for(int i = 1; i < x.length; i++){
            result *= x[i];
        }
        return result;
    }
}
