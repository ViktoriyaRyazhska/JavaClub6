package StringProgram;

import java.util.Scanner;

public class StringProgramTask59 {
    public static String tripleTrouble() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Create a function that will return a string that combines all of the letters of the three \n"+
                "inputed strings in groups. Taking the first letter of all of the inputs and grouping them \n"+
                "next to each other. Do this for every letter, see example below!\n");
        System.out.print("First word");
        String one=scanner.next();
        System.out.print("Second word");
        String two=scanner.next();
        System.out.print("Third word");
        String three=scanner.next();
        String[] part1 = one.split("");
        String[] part2 = two.split("");
        String[] part3 = three.split("");
        String res = "";

        for(int i = 0; i < part1.length; i++){
            res+=part1[i]+part2[i]+part3[i];
        }
        System.out.println(res);
        return res;
    }


}
