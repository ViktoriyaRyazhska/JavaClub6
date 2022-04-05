package utils;


public enum Folders {
    BASIC(1, "Basic", 1,11),
    CLASSES(2, "Classes",12,17),
    CONDITIONS(3,"Conditions",18,31),
    LOOPS(4, "Loops",32,46),
    OOP(5, "OOP",47,50),
    STRINGS(6, "Strings",51,68),
    COLLECTIONS(7, "Collections",69,72);

    private final int id;
    private final String folderName;
    private final int start;
    private final int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }



    Folders(int id, String folderName, int start, int end) {
        this.id = id;
        this.folderName = folderName;
        this.start = start;
        this.end = end;
    }

    public static Folders getFolderById(int id) {
        for (Folders folders : values()) {
            if (folders.id == id) {
                return folders;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getFolderName() {
        return folderName;
    }

    public String getCountTask() {
        return ": task numbers from " + start + " to " + end;
    }



    /*public static int getStart(int id){
        for (Folders folders : values()) {
            if (folders.id == id) {
                return start;
            }
        }
        return 0;
    }
    public static int getEnd(int id){
        for (Folders folders : values()) {
            if (folders.id == id) {
                return this.end;
            }
        }
        return 0;
    }*/
}
