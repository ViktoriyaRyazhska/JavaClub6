package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task4{
}
class Dictionary{
    Map<String, String> words = new HashMap<String, String>();
    public void newEntry(String word, String entry){
        words.put(word, entry);
    }
    public String look(String word){
        if(words.get(word) != null) return words.get(word);
        return "Cant find entry for " + word;
    }
}

