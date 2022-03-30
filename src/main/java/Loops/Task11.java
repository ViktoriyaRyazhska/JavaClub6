package Loops;

public class Task11 {
    public static int twiceAsOld(int fatherAge, int sonAge){
        int age = fatherAge;
        if (fatherAge * 1.0 / 2 > sonAge){
            while (fatherAge * 1.0 / 2 != sonAge){
                fatherAge++;
                sonAge++;
            }
            return fatherAge - age;
        } else {
            while (fatherAge * 1.0 / 2 != sonAge){
                fatherAge--;
                sonAge--;
            }
            return age - fatherAge;
        }
    }
}
