package Classes;

import java.util.Scanner;

public class ClassTask16 {

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1, b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) {
                System.out.println("Fighter " + a.name + " wins");
                return a.name;  // a wins
            }
            if ((a.health -= b.damagePerAttack) <= 0) {
                System.out.println("Fighter " + b.name + " wins");
                return  b.name;
            }
        }
    }
    public static void declareWinner (Scanner scanner) {

        System.out.println("Two fighters, one winner.");
        System.out.println("Enter first fighter stats through the spaces [name, health, damage]:");

        String name = scanner.next();
        int health = scanner.nextInt();
        int damage = scanner.nextInt();

        Fighter fighter1 = new Fighter(name, health, damage);

        System.out.println("Enter second fighter stats through the spaces [name, health, damage]:");
        name = scanner.next();
        health = scanner.nextInt();
        damage = scanner.nextInt();

        Fighter fighter2 = new Fighter(name, health, damage);

        System.out.println("Enter the name of fighter who attacks first:");

        String firstAttacker = scanner.next();

        Fighter a = fighter1, b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0){
                System.out.println("Fighter " + a.name + " wins");

            }
            if ((a.health -= b.damagePerAttack) <= 0) {
                System.out.println("Fighter " + b.name + " wins");
            }

        }
    }
}

