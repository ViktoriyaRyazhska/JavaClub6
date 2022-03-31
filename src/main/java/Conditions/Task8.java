package Conditions;
/**   Task 8
 * @author wertylu*/
public class Task8 {

    public static boolean isLove(final int flower1, final int flower2) {
        if((flower1%2==0 && flower2%2!=0)||(flower1%2!=0 && flower2%2==0))
            return true;
        else
            return false;

    }

}