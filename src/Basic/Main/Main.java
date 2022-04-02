package Main;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FirstHelloMenu firstHelloMenu=new FirstHelloMenu();
        firstHelloMenu.chooseTopicOfTask(scanner);
    }
}