package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task15 {
    public static String SortAndStar(String[] vector){
        List<String> list = Arrays.asList(vector);
        Collections.sort(list);
        String rawResult = list.get(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rawResult.length() - 1; i++){
            result.append(rawResult.charAt(i)).append("***");
        }
        return result.toString() + rawResult.charAt(rawResult.length() - 1);
    }
}
