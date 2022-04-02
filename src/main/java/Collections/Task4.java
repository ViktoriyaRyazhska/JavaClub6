package Collections;

import java.util.*;

public class Task4 {
    Map<String, String> dictionary = new HashMap<>();

    public void newEntry(String key, String value) {
        dictionary.put(key, value);
    }

    public String look(String key) {
        String entry = dictionary.get(key);
        if (entry == null) {
            return "Cant find entry for " + key;
        } else {
            return entry;
        }
    }
}
