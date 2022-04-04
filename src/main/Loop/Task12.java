package main.Loop;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();
        System.out.println("The nearest square: " + Task12.nearestSquare(number));
    }
    public static int nearestSquare(int number){
        int down = number, up = number;
        while (Math.sqrt(up) != Math.round(Math.sqrt(up)) || Math.sqrt(down) != Math.round(Math.sqrt(down))){
            up++;
            if (down == 0) continue;
            down --;
        }
        if (Math.sqrt(up) == Math.round(Math.sqrt(up))) return up; else return down;
    }
}
