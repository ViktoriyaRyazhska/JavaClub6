package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsTask71 {

    public static List CreateList() {

        System.out.println("Unfinished Loop - Bug Fixing #1");
        System.out.print("Enter amount of numbers you want in array: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
            System.out.println(list);
        }

        return list;
    }

}
