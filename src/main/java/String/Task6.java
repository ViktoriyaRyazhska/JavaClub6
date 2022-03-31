package String;
/**   Task 6
 * @author wertylu*/
public class Task6 {
    public static String areYouPlayingBanjo(String name) {
        char name1 =name.charAt(0);
        char r = 'r';
        char r1 = 'R';
        if(name1 == r||name1== r1) {return name+" plays banjo";}
        else return name+ " does not play banjo";
    }
}
