package Loops;

public class Task32 {
    public static String repeatStr(final int repeat, final String string) {
        String res="";
        for(int i=0;i<repeat;i++){
            res+=string;
        }
        return res;
    }
}
