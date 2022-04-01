import java.util.Scanner;

public class MainApp {

    static void menu() {
        System.out.println();
        System.out.println("=========================Menu=============================");
        System.out.println("1 - Basic");
        System.out.println("2 - Classes");
        System.out.println("3 - Conditions");
        System.out.println("4 -  Loops");
        System.out.println("5 -  OOP");
        System.out.println("6 - String");
        System.out.println("7 - Collections");

        Scanner sc = new Scanner(System.in);
        System.out.println();

        while (true) {

            switch (sc.next()) {

                case "1": {
                    AllMenu.menuBasic();
                    break;
                }

                case "2": {
                    AllMenu.menuClasses();
                    break;
                }

                case "3": {
                    AllMenu.menuConditions();
                    break;
                }
                case "4": {
                    AllMenu.menuLoops();
                    break;
                }

                case "5": {
                    AllMenu2.menuOOP();
                    break;
                }

                case "6": {
                    AllMenu2.menuString();
                    break;
                }
                case "7": {
                    AllMenu2.menuCollections();
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        menu();

    }
}