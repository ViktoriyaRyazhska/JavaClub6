package main.Collections.Task4;

import java.util.HashMap;

public class Dictionary {
    private static HashMap<String, String> words = new HashMap<>();

    public static void newEntry(String key, String value) {
        words.put(key, value);
    }

    public static String look(String key) {
        return words.containsKey(key) ? words.get(key) : "Cant find entry for " + key;
    }
}
