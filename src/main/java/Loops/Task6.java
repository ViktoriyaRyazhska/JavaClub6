package Loops;
/**   Task 6
 * @author wertylu*/

public class Task6{

    public static int[] reverse(int n){
        int x = n;
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = x;
            x--;
        }
        return arr;
    }

}
