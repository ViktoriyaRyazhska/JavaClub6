package Classes;

public class Task5 {
    public static void main(String[] args) {

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean firstFighterAttacks = firstAttacker == fighter1.name;
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (firstFighterAttacks) {
                fighter2.health -= fighter1.damagePerAttack;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
            }
            firstFighterAttacks = !firstFighterAttacks;
        }
        if (fighter1.health <= 0) {
            return fighter2.name;
        } else {
            return fighter1.name;
        }
    }
}

