//L3375p34k
//https://www.codewars.com/kata/l3375p34k/
//Author:Maksim Dziurei



package OOP;

import java.util.Scanner;

public class OOPTask50 {
    public static class Leetspeak extends Encoder {

        public static String encode(String source) {
            if (source == null || source == "") {
                return "";
            }

            source = source.replaceAll("[aA]", "4");
            source = source.replaceAll("[eE]", "3");
            source = source.replaceAll("[lL]", "1");
            source = source.replaceAll("[mM]", "/^^\\\\");
            source = source.replaceAll("[oO]", "0");
            source = source.replaceAll("[uU]", "_");


            return source;
        }
        public static void encode(){
            Scanner sc = new Scanner(System.in);
            System.out.println("L3375p34k");
            System.out.println("Dictionary:");
            System.out.println("a -> 4\n" +
                    "e -> 3\n" +
                    "l -> 1\n" +
                    "m -> /^^\\\n" +
                    "o -> 0\n" +
                    "u -> (_)");
            String  source = sc.nextLine();
            source = source.replaceAll("[aA]", "4");
            source = source.replaceAll("[eE]", "3");
            source = source.replaceAll("[lL]", "1");
            source = source.replaceAll("[mM]", "/^^\\\\");
            source = source.replaceAll("[oO]", "0");
            source = source.replaceAll("[uU]", "_");
            System.out.println(source);

        }

    }

    abstract static class Encoder {
        public static String encode(String source) {
            return null;
        }
    }
}
