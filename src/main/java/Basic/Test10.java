package Basic;

public class Test10 {
    public static String datingRange(int age) {
        int min, max = 0;
        if (age <= 14) {
            min = (int) (age - (0.1 * age));
            max = (int) (age + (0.1 * age));
        } else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }
        String range = min + "-" + max;
        return range;
    }
}
