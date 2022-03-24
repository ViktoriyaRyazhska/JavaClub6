import java.util.Scanner;

public class HelloMenu {
    Scanner scanner = new Scanner(System.in);
    public void chooseTask() {
        System.out.println("Choose the number of tasks:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 1:
                System.out.print("Put the data, i= ");
                int putData = scanner.nextInt();
                doubleInteger(putData);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }

    public static int doubleInteger(int i) {
        System.out.println("Task1:Code as fast as you can! You need to double the integer and return it.");
        int result=i * i;
        System.out.println(result);
        return result;

    }
}