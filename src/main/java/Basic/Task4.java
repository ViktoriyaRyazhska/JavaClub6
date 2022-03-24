package Basic;

public class Task4 {

    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength%pixelSize==0){
            return true;
        }
        else return false;
    }
}