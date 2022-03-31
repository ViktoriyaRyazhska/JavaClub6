package com.example.softserve;

public class String8 {
    public static String tripleTrouble(String one, String two, String three) {
        String string = "";
        String[] strings = {one, two, three};;

        for (int i = 0; i < one.length(); ++i) {
            for (int j = 0; j < strings.length; ++j) {
                string += strings[j].charAt(i);
            }
        }

        return string;
    }
}
