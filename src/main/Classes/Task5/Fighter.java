package main.Classes.Task5;

import java.util.Objects;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter() {
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return health == fighter.health &&
                damagePerAttack == fighter.damagePerAttack &&
                Objects.equals(name, fighter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, damagePerAttack);
    }

    public static void fight(Fighter f1, Fighter f2) {
        while (f1.getHealth() > 0 || f2.getHealth() > 0) {
            System.out.print(f1.name + " attacks " + f2.name+"\t");
            f2.setHealth(f2.getHealth() - f1.getDamagePerAttack());
            if (f2.getHealth() > 0) {
                System.out.println(f2.name + " now has " + f2.health + " health");
            } else {
                System.out.println(f2.name + " now has " + f2.health + " health and is dead. " + f1.name + " wins");
                break;
            }
            System.out.print(f2.name + " attacks " + f1.name+"\t");
            f1.setHealth(f1.getHealth() - f2.getDamagePerAttack());
            if (f1.getHealth() > 0) {
                System.out.println(f1.name + " now has " + f1.health + " health");
            } else {
                System.out.println(f1.name + " now has " + f1.health + " health and is dead. " + f2.name + " wins");
                break;
            }
        }
    }
}
