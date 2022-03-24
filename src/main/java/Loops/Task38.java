package Loops;

public class Task38 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double sum = 0;
        for(int i = 0; i<classPoints.length; i++){
            sum+=classPoints[i];
        }
        if(sum/classPoints.length < yourPoints){
            return true;
        }

        else{
            return false;
        }
    }
}
