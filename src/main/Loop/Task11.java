package main.Loop;

public class Task11 {

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30, 0));
        System.out.println(TwiceAsOld(30, 7));
        System.out.println(TwiceAsOld(45, 30));
    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        int twiceAsOld = dadYears - sonYears * 2;
        return twiceAsOld > 0 ? twiceAsOld : (-1) * twiceAsOld;
    }
}
