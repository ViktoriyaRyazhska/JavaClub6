package Loops;

public class Task7 {
    public static boolean betterThanAverage(int [] classPoints, int yourPoints){
        int amount = 0;
        boolean result = false;
        
        for (int i = 0; i<classPoints.length; i++){
            amount += classPoints[i];
        }
        
        if (yourPoints > amount/classPoints.length){
            result = true;
        }
        
        return result;
    }
}
