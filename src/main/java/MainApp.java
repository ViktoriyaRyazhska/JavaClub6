import java.util.Scanner;

public class MainApp {

    static void showMenu() {
        System.out.println("\n=========================Menu=============================");
        System.out.println("1 - Basic");
        System.out.println("2 - Classes");
        System.out.println("3 - Conditions");
        System.out.println("4 - Loops");
        System.out.println("5 - OOP");
        System.out.println("6 - String");
        System.out.println("7 - Collections");

        Scanner sc = new Scanner(System.in);
        System.out.println();

        while (true) {

            switch (sc.next()) {

                case "1": {
                    AllMenu.showBasicMenu(sc);
                    break;
                }

                case "2": {
                    AllMenu.showClassesMenu(sc);
                    break;
                }

                case "3": {
                    AllMenu.showConditionsMenu(sc);
                    break;
                }
                case "4": {
                    AllMenu.showLoopsMenu(sc);
                    break;
                }

                case "5": {
                    AllMenu2.showOOPMenu(sc);
                    break;
                }

                case "6": {
                    AllMenu2.showStringMenu(sc);
                    break;
                }
                case "7": {
                    AllMenu2.showCollectionsMenu(sc);
                    break;
                }

            }

        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
