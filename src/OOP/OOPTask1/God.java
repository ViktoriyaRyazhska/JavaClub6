// https://www.codewars.com/kata/basic-subclasses-adam-and-eve
public class God {
    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }
}

class Human {}

class Man extends Human {}

class Woman extends Human {}