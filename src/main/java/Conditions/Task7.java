package Conditions;

public class Task7 {
    public static void main(String[] args) {

    }

    public static Integer basicMath(String op, int v1, int v2) {
        Integer result = 0;
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
        }
        return result;
    }
}