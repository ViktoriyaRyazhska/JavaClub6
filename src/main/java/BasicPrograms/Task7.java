package BasicPrograms;

public class Task7 {
    public static int timeSinceMidnight(int hours, int minutes, int seconds){
        return hours * 60 * 60 * 1000 + minutes * 60 * 1000 + seconds * 1000;
    }
}
