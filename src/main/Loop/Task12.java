package main.Loop;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        System.out.println("The nearest square: " + Task12.nearestSquare(in.nextInt()));
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
