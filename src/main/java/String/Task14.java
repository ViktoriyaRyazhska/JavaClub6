package String;

/**   Task 14
 * @author MichaelShv*/

public class Task14 {
    public static int strCount(String str, char letter) {
        int charAmount = 0;
        for(char i : str.toCharArray()) {
            if(letter == i) {
                charAmount++;
            }
        }
        return charAmount;
    }
}
