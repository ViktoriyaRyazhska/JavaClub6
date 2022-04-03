package main.OOP.OOPTask1;

// https://www.codewars.com/kata/basic-subclasses-adam-and-eve
public class God {
    public static Human[] create() {
        System.out.println("Was created new Human array with one Man and one Woman");
        return new Human[]{new Man(),new Woman()};
    }
}

class Human {
}

class Man extends Human {
}

class Woman extends Human {
}