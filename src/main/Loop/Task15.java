package main.Loop;

public class Task15 {
    public static void main(String[] args) {
        int sticks = 21;
        while (sticks !=0) {
            int bob = RobotWin(sticks);
            sticks -= bob;

            System.out.print("Bob takes "+ bob + "\t Left " + sticks + " sticks\n");
            if(sticks!=0){
                int jack=Random123(sticks);
                sticks-=jack;
                System.out.print("Jack takes " + jack+ "\t Left " + sticks + " sticks\n");
                if (sticks==0) System.out.println("Jack win!");
            }else System.out.println("Bob win!");


        }
    }

    public static int Random123(int sticks) {
        return (int) (1 + Math.random() * 3);
    }
    public static int RobotWin(int sticks){
        switch (sticks){
            case 7:
            case 3:
                return 3;
            case 6:
            case 2:
                return 2;
            case 5:
            case 1:
                return 1;
            default:return 3;
        }
    }
}
