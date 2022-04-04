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
        public static void encode(Scanner sc){
            System.out.println("The objective of this Kata is to provide some way to encode \n"+
                    "a string into its leetspeak version.\n"+
                    "Specific Instructions\n"+
                    "1)The code must contain a Leetspeak class inherited from an Encoder abstract \n"+
                    "class and containing an encode(String) method returning itself the encoded String.\n"+
            "2)The encode method should return an empty String if a null parameter is passed.\n"+
                    "3)If any uppercase character is given, it should be compared also with the dictionary, \n"+
                    "'a' gives '4' but 'A' gives also '4'.\n"+"4)If any character outside the dictionary is given,\n"+
                    " it should be output as is.\n");
            System.out.println("The following dictionary has to be used :");
            System.out.println("a -> 4\n" +
                    "e -> 3\n" +
                    "l -> 1\n" +
                    "m -> /^^\n" +
                    "o -> 0\n" +
                    "u -> (_)\n");
            System.out.print ("Put your source= ");
            String  source = sc.next();

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
