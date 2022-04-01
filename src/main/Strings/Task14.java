package main.Strings;

public class Task14 {
    public static void main(String[] args){System.out.println(strCount("Ababagalamaga", 'a'));}
    public static int strCount(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(letter == str.charAt(i)){
                counter++;
            }
        }
        return counter;
    }
}
