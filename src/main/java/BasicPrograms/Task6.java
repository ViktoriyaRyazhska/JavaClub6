package BasicPrograms;

public class Task6 {
    public static int toBinary(int n) {
        String result1 = Integer.toBinaryString(n);
        int result2 = Integer.valueOf(result1);
        return result2;
    }
}
