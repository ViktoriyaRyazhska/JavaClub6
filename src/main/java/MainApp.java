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

    }

    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
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
                    AllMenu.menuOOP();
                    break;
                }

                case "6": {
                    AllMenu.menuString();
                    break;
                }
                case "7": {
                    AllMenu.menuCollections();
                    break;
                }
            }

        }

    }
}
