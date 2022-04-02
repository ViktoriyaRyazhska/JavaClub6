package String;

import java.util.Arrays;
import java.util.Collections;

/**Task 2
 * @author sshaparenko*/

public class Task2 {

    public static String solution(String str){

        char[] ch;
        ch = str.toCharArray();
        StringBuffer sbf = new StringBuffer();

        for(int i = ch.length-1; i >= 0; i --){
            sbf.append(ch[i]);
        }
        return sbf.toString();
    }

}
