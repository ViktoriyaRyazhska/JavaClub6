package OOP;

public class Task1 {
    // https://www.codewars.com/kata/547274e24481cfc469000416/train/java

    public static Human[] create() {
        Human[] par = new Human[2];
        par[0] = new Man();
        par[1] = new Woman();
        return par;
    }
}

class Human {

}

class Man extends Human {

}

class Woman extends Human {

}
