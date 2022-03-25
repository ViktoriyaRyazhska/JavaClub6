import java.util.Scanner;

public class BasicTask7 {
    public static void Past()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("            ---WELCOME---");
        System.out.println("To write a function which returns the time since midnight in milliseconds.");
        System.out.print("Put the dats od hours= ");
        int h=scanner.nextInt();
        System.out.print("minutes= ");
        int m=scanner.nextInt();
        System.out.print("seconds");
        int s=scanner.nextInt();
        System.out.println("result in milliseconds is "+ h*60*60*1000+m*60*1000+s*1000);
    }


}
