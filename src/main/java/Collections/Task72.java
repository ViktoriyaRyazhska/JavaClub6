public class Dictionary {
    private String key;
    private String value;

    public Dictionary() {

    }

    public void newEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String look(String key) {
        if (this.key == key) {
            return this.value;
        }
        return ("Cant find entry for " + key);
    }
}