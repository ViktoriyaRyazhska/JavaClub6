package Classes;

/**   Task 5
 * @author MichaelShv*/

public class Task5 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (fighter1.name.equals(firstAttacker)) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                } else {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    if (fighter1.health<=0) {
                        winner = fighter2.name;
                        break;
                    }
                }
            } else {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if(fighter1.health<=0) {
                    winner = fighter2.name;
                    break;
                } else {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    if(fighter2.health<=0) {
                        winner = fighter1.name;
                        break;
                    }
                }
            }
        }
        return winner;
    }
    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
