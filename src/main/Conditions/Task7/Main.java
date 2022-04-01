package main.Conditions.Task7;

public class Main {
    public static void main(String[] args) {System.out.println(basicMath("*",6, 3));}
    public static Integer basicMath(String op, int v1, int v2) {
        int res = 0;
        if (op == "+"){
            res = v1+v2;
        }
        if (op == "-"){
            res = v1-v2;
        }
        if (op == "*"){
            res = v1*v2;
        }
        if (op == "/") {
            res = v1/v2;
        }
        return res;
    }
}
