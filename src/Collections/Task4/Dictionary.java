import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words = new HashMap<>();

    public void newEntry(String key, String value) {
        words.put(key, value);
    }

    public String look(String key) {
        return words.containsKey(key) ? words.get(key) : "Cant find entry for " + key;
    }
}
