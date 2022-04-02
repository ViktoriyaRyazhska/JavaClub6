package OOP;

/**   Task 1
 * @author MichaelShv*/

public class Task1 {
    public static Human[] create(){
        Human[] firstHumans = new Human[2];
        firstHumans[0] = new Man();
        firstHumans[1] = new Woman();
        return firstHumans;
    }
}

class Human { }

class Man extends Human { }

class Woman extends Human{ }
