import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class FirstHelloMenu {
    Scanner scanner = new Scanner(System.in);

    public void chooseTopicOfTask() {
        System.out.println("WELCOME");
        System.out.println("CHOOSE THE NUMBER OF TOPIC:");
        System.out.println("BASIC PROGRAM -1");
        System.out.println("CLASSES-2");
        System.out.println("CONDITIONS-3");
        System.out.println("LOOPS-4");
        System.out.println("STRING-5");
        System.out.println("COLLECTIONS-6");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 1:
                new BasicProgramMenu().chooseTask();
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
        }
    }
}