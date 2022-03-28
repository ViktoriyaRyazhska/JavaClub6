package Conditions;

import java.util.Scanner;

public class ConditionsTask24 {
    public static String  rps() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play! You have to return which player won! In case of a draw return Draw!.");
        String p1=scanner.next();
        String p2=scanner.next();
        if ((p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock")) || (p1.equals("rock")) && p2.equals("scissors")){
            System.out.println("Player 1 won!");
            return "Player 1 won!";
        }
        else if ((p1.equals("scissors") && p2.equals("rock"))
                || (p1.equals("rock") && p2.equals("paper")) || (p1.equals("paper") && p2.equals("scissors"))) {
            System.out.println("Player 2 won!");
            return "Player 2 won!";
        }
        else if (p1==p2)
            System.out.println("Draw");
            return "Draw";
    }
}
