package Loops;

/**Task 9
 * @author sshaparenko*/

public class Task9 {
    public static int sum(int[] arr){
        int s = 0;
        for (int a:arr){
            if(a>0){
                s += a;
            }
        }
        return s;
    }
}
