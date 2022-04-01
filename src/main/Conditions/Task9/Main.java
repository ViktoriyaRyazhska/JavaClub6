package main.Conditions.Task9;
//https://www.codewars.com/kata/convert-boolean-values-to-strings-yes-or-no/
public class Main {
    public static void main(String[] args) {
        System.out.println(ConvertToString(true));
    }
    public static String ConvertToString(boolean b){
        if(b)return "Yes";
        else return "No";

    }
}
