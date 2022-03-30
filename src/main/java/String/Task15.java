package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task15 {
    public static String SortAndStar(String[] vector){
        List<String> list = Arrays.asList(vector);
        Collections.sort(list);
        String rawResult = list.get(0);
        String result = "";
        for (int i = 0; i < rawResult.length() - 1; i++){
            result += rawResult.charAt(i) + "***";
        }
        return result + rawResult.charAt(rawResult.length() - 1);
    }
}
