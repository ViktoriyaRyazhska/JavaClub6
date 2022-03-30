package Conditions;

public class Task8 {
    public static boolean isLove(final int flower1, final int flower2) {

        return flower1 % 2 == 0 && flower2 % 2 == 1 || flower2 % 2 == 0 && flower1 % 2 == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isLove(4, 5));
        System.out.println(isLove(5, 6));
        System.out.println(isLove(4, 4));
        System.out.println(isLove(5, 5));
    }
}
