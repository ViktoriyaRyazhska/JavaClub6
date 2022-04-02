//        Age Range Compatibility Equation
//        https://www.codewars.com/kata/5803956ddb07c5c74200144e/train/java
//        Author:Maksim Dziurei
package BasicProgram;
import java.util.Scanner;

public class BasicTask10 {

    public static String datingRange (int age){
        int min, max;
        String res;
        if (age > 14) {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        } else {
            min = age - age / 10;
            max = age + age / 10;
        }
        res=  min+"-"+max;
        return res;
    }

    public static String datingRange (Scanner sc) {
        int min, max, age;
        String res;
        System.out.println("            ---WELCOME---");
        System.out.println("---Age Range Compatibility Equation---");
        System.out.print("Enter yor age: ");
        age = sc.nextInt();
        if (age > 14) {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        } else {
            min = age - age / 10;
            max = age + age / 10;
        }
        res= "Your result: "+min+"-"+max;
        System.out.print(res);
        return res;
    }
}
