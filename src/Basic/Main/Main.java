package Main;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_UNDERLINED = "\033[4;31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstHelloMenu firstHelloMenu = new FirstHelloMenu();
        firstHelloMenu.chooseTopicOfTask(scanner);
    }
}