package Collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class Task72 {
    private String key;
    private String value;
    static Map<String, String> map = new HashMap<String, String>();
    public Task72() {

    }

    public void newEntry(String key, String value) {
        map.put(key, value);
    }

    public String look(String key) {
        for (String k: map.keySet())
        if (k.equals(key)) {
            return map.get(k);
        }
        return ("Cant find entry for " + key);
    }
}