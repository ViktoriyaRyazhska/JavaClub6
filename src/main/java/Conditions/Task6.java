package Conditions;

/**Task 6
 * scissors -> paper -> rock
 * @author sshaparenko*/

public class Task6 {
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
