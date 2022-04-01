package BasicPrograms;

/** Task 4 from BasicPrograms
 * @author RoSteik*/

public class Task4 {

    public static boolean isDivisible(int wallLength, int pixelSize) {

        if( wallLength % pixelSize == 0){
            return true;
        }

        return false;
    }

}