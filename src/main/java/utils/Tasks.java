package utils;

public enum Tasks {
    TASK_3(3, "Volume of a Cuboid",
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation.");

    private final int id;
    private final String taskName;
    private final String description;

    Tasks(int id, String taskName, String description) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    public static Tasks getTaskById(int id) {
        for (Tasks task : values()) {
            if (task.id == id) {
                return task;
            }
        }
        return null;
    }

    public static String getDescription(int id) {
        for (Tasks task : values()) {
            if (task.id == id) {
                return task.description;
            }
        }
        return " ";
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }
}
