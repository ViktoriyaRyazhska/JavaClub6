package Classes;

public class Task16 {
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
        int round;
        if(fighter1.name==firstAttacker){
            round=1;
        }
        else round=2;

        while(fighter1.health>0&&fighter2.health>0){
            if(round%2==0){
                fighter1.health-=fighter2.damagePerAttack;
            }
            else fighter2.health-=fighter1.damagePerAttack;
            round++;
        }


        if(fighter1.health<=0&&fighter2.health<=0){
            return firstAttacker;}
        else if(fighter2.health<=0){return fighter1.name;}
        else {return fighter2.name; }
    }
}