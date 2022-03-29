package Basic;

public class Task4 {
    public static void main(String[] args) {System.out.println(isDivisible(4050,27));}
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
}
