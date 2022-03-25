import java.util.Scanner;

public class HelloMenu {
    Scanner scanner = new Scanner(System.in);
    public void chooseTask() {
        System.out.println("Choose the number of tasks:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 1:
                Task1.doubleInteger();
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
            case 10:
                Task10.ageCounter();

                break;
        }
    }


}