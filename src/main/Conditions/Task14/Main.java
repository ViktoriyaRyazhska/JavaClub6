package main.Conditions.Task14;

public class Main {
    public static void main(String[] args) {
        System.out.println(TotalAmount(7));

    }
    public static int TotalAmount(int days){
        if(days>=7){
            return days*40-50;
        }else if (days>=3){
            return days*40-20;
        }
        else return days*40;
    }
}
