package Conditions;

public class Task27 {
    public static int enough(int cap, int on, int wait){

        return Math.max (wait+on-cap,0);

    }
}