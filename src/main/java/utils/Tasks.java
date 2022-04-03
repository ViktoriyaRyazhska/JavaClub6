package utils;

public enum Tasks {
    TASK_2(2, "Multiplying two numbers", "Implement a function which multiplies two numbers."),
    TASK_3(3, "Volume of a Cuboid",
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation."),
    TASK_6(6, "Convert to Binary", "Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format."),
    TASK_7(7,"Beginner Series #2 Clock","Clock shows h hours, m minutes and s seconds after midnight.\n" +
            "\n"+ "Your task is to write a function which returns the time since midnight in milliseconds."),
    TASK_4(4, "Thinkful - Number Drills: Pixelart planning",
            "Your function should take two arguments: the size of the wall in millimeters and the size"
                    +"\n" +"of a pixel in millimeters. It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False. "),
    TASK_8(8, "Century From Year",
            "Given a year, return the century it is in."),
    TASK_12(12, "Lombok Encapsulation",
            "In Java, we have a very powerful library named Lombok. It helps to reduce the boilerplate code."
                    +"\n" +"This Kata is a challenge created for you to learn how to use lombok."),
    TASK_16(16, "Two fighters, one winner.",
            "Create a function that returns the name of the winner in a fight between two fighters."),
    TASK_20(20, "Convert a Boolean to a String",
            "Implement a function which convert the given boolean value into its string representation."),
    TASK_24(24, "Basic Mathematical Operations",
            "Your task is to create a function that does four basic mathematical operations."),
    TASK_28(28, "The Modulo-3 Sequence",
            "Consider a sequence where the first two numbers are 0 and 1 and the next number of the "
                    +"\n" +"sequence is the sum of the previous 2 modulo 3. Write a function that finds the nth number of the sequence."),
    TASK_32(32, "String repeat",
            "Write a function called repeatStr which repeats the given string string exactly n times."),
    TASK_36(36, "Counting sheep...",
            "Consider an array/list of sheep where some sheep may be missing from their place. We need a "
                    +"\n" +"function that counts the number of sheep present in the array (true means present)."),
    TASK_40(40, "Sum of positive",
            "You get an array of numbers, return the sum of all of the positives ones."),
    TASK_44(44, "Grasshopper - Summation",
            "Write a program that finds the summation of every number from 1 to num. The number will"
                    +"\n" +" always be a positive integer greater than 0."),
    TASK_48(48, "Rotations and reflections I",
            "There are exactly eight ways to map a square onto itself by rotation or reflection. We can take its"
                    +"\n" +" mirror image (reflection in horizontal, vertical, or either of two 45-degree diagonal lines); rotate it (by 90 degrees clockwise, 90 degrees anti-clockwise, or 180 degrees); or just leave it alone."),
    TASK_52(52, "Reversed Strings",
            "Complete the solution so that it reverses the string passed into it."),
    TASK_56(56, "Are You Playing Banjo?",
            "Create a function which answers the question \"Are you playing banjo?\".\n" +
                    "If your name starts with the letter \"R\" or lower case \"r\", you are playing banjo!"),
    TASK_60(60, "Fake Binary",
            "Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 "
                    +"\n" +"and above with '1'. Return the resulting string."),
    TASK_64(64, "All Star Code Challenge #18",
            "Create a function that accepts 2 string arguments and returns an integer of the count of "
                    +"\n" +"occurrences the 2nd argument is found in the first one."),
    TASK_68(68, "Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right",
            "Remove n exclamation marks in the sentence from left to right. n is positive integer."),
    TASK_72(72, "Interactive Dictionary",
            "In this kata, your job is to create a class Dictionary which you can add words to and their entries.");






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
