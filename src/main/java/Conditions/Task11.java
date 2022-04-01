package Conditions;

/**Task 11 from Conditions
 * @author RoSteik*/

public class Task11 {
    private static int result;
    public static int sequence(int n) {
        int array[] = new int[n];
        array[0] = 0;
        array[1] = 1;
        for(int i=2; i < n; i++){
            array[i] = (array[i-1] + array[i-2]) % 3;
        }
        return array[n-1];
    }
}
