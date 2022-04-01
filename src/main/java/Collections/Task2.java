package Collections;

/** Task 2 from Loops
 * @author RoSteik*/

import java.util.*;

class Task2 {
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }
}