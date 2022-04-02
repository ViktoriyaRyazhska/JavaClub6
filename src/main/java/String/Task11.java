package String;

/**     Task 11 from String
 * @author RoSteik*/

public class Task11 {
    public static int howOld(final String herOld) {
        int herOldInNumber=0;
        if(Character.getNumericValue(herOld.charAt(0))>=0 && Character.getNumericValue(herOld.charAt(0))<=9) {
         herOldInNumber = Character.getNumericValue(herOld.charAt(0));
        }
        else{
            System.out.println("something went wrong");
            return -1;
        }
        return herOldInNumber;
    }
}