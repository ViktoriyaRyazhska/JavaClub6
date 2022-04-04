package main.Conditions.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first player selection (scissors,paper,rock): ");
        String op =scanner.next();
        System.out.print("Enter the second player selection (scissors,paper,rock): ");
        String op2 =scanner.next();
        String rps = rps(op, op2);
        System.out.println(rps);

    }
    public static String rps (String p1, String p2){
        String s = "";
        if (p1.equals("scissors") && p2.equals("paper")){
            s = "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors")) {
            s =  "Player 2 won!";
        } else if (p1.equals("paper") && p2.equals("rock")){
            s = "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("paper")){
            s = "Player 2 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")){
            s = "Player 1 won!";
        } else if (p1.equals("scissors") && p2.equals("rock")){
            s = "Player 2 won!";
        } else if(p1.equals(p2)){
            s = "Draw!";
        }
        return s;
    }
}
