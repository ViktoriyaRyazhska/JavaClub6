package main.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        boolean b = true;
        System.out.println("Enter number to add\t| Enter 'exit' to exit");
        do {

            String str = scanner.next();
            if(str.equals("exit")){
                b=false;
            }
            else {
                int number = Integer.parseInt(str);
                list.add(number);
            }
        }while (b==true);
        System.out.println("Drop list "+ DropEven(list));

    }

    public static List<Integer> DropEven(List<Integer> list) {
        List<Integer>newList=new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer iter = iterator.next();
            if (iter % 2 != 0) {
                newList.add(iter);
            }
        }

        return newList;
    }
}
