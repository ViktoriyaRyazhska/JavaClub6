package BasicPrograms;

public class Task8 {
    public static int getCentury(int year){
        if (year % 100 == 0){
            return year / 100;
        } else {
            return year / 100 + 1;
        }
    }
}
