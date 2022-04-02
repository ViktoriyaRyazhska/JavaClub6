//All Star Code Challenge #18
//http://www.codewars.com/kata/all-star-code-challenge-number-18/
//Author:Maksim Dziurei



package StringProgram;

import java.util.Scanner;

public class StringProgramTask65 {
    public static int strCount(String str, char letter) {
        int counter = 0;
        for(char character : str.toCharArray()) {
            if(letter == character) {
                counter++;
            }
        }
        return counter;
    }
    public static int strCount(){
        int counter = 0;
        String str;
        char letter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        str=sc.nextLine();
        System.out.print("Letter: ");
        letter = sc.next().charAt(0);
        for(char character : str.toCharArray()) {
            if(letter == character) {
                counter++;
            }
        }
        System.out.println(counter);

        return counter;
    }


}
