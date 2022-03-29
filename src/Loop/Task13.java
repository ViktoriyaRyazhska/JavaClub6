package Loop;

public class Task13 {
    public static void main(String[] args){System.out.println(summation(5));}
    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        return result;
    }
}
