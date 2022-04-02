package main.Collections.Task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter 'add' to add record\t| Enter 'find' to find record\t| Enter 'exit' to exit");
            String str = scanner.next();
            if (str.equals("add")){
                System.out.print("ENTER KEY: ");
                String key=scanner.next();
                System.out.print("ENTER VALUE: ");
                String value = scanner.next();
                d.newEntry(key,value);
                System.out.println("Record save");
            }else if(str.equals("find")){
                System.out.print("ENTER KEY: ");
                String key=scanner.next();
                System.out.println(d.look(key));
            }else if(str.equals("exit")){
                b=false;
            }
            else continue;

        } while (b == true);
    }

}
