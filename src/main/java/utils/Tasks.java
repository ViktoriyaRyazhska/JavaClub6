package utils;

public enum Tasks {
    TASK_2(2, "Multiplying two numbers", "Implement a function which multiplies two numbers."),
    TASK_3(3, "Volume of a Cuboid",
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation."),
    TASK_6(6, "Convert to Binary", "Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format."),
    TASK_7(7,"Beginner Series #2 Clock","Clock shows h hours, m minutes and s seconds after midnight.\n"
            + "Your task is to write a function which returns the time since midnight in milliseconds."),
    TASK_11(11,"Grasshopper - Debug","Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius. Unfortunately his code has some bugs.\n" +
            "\n" +
            "Find the errors in the code to get the celsius converter working properly.\n" +
            "\n" +
            "To convert fahrenheit to celsius:\n" +
            "\n"+
            "Remember that typically temperatures in the current weather conditions are given in whole numbers. \n"+
            "It is possible for temperature sensors to report temperatures with a higher accuracy such as to the nearest tenth. \n"
            +"Instrument error though makes this sort of accuracy unreliable for many types of temperature measuring sensors.");

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
