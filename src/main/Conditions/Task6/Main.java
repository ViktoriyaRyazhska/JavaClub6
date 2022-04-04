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
        if (p1 == "scissors" && p2 == "paper"){
            s = "Player 1 won!";
        } else if (p1 == "paper" && p2 == "scissors") {
            s =  "Player 2 won!";
        } else if (p1 == "paper" && p2 == "rock"){
            s = "Player 1 won!";
        } else if (p1 == "rock" && p2 == "paper"){
            s = "Player 2 won!";
        } else if (p1 == "rock" && p2 == "scissors"){
            s = "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "rock"){
            s = "Player 2 won!";
        } else if(p1 == p2){
            s = "Draw!";
        }
        return s;
    }
}
