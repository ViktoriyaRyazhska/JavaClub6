package utils;

public enum Tasks {
    TASK_2(2, "Multiplying two numbers", "Implement a function which multiplies two numbers."),
    TASK_3(3, "Volume of a Cuboid",
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the " +
                    "height of the cuboid. Write a function to help Bob with this calculation."),
    TASK_6(6, "Convert to Binary", "Given a non-negative integer n, write a function to_binary/" +
            "ToBinary which returns that number in a binary format."),
    TASK_10(10,"Age Range Compatibility Equation", "Everybody knows the classic \"half your age " +
            "plus seven\" dating rule that a lot of people follow (including myself). It's the 'recommended' age range " +
            "in which to date someone."),
    TASK_14(14, "Fractions class", "You are provided with a skeleton of the class 'Fraction', " +
            "which accepts two arguments (numerator, denominator).EXAMPLE:  Fraction fraction1 = new Fraction(4, 5);" +
            "Your task is to make this class string representable, and addable while keeping the result in the minimum " +
            "representation possible."),
    TASK_18(18, "Opposite number","Very simple, given an integer or a floating-point number," +
            " find its opposite."),
    TASK_22(22, "How old will I be in 2099?", "Philip's just turned four and he wants to know how " +
            "old he will be in various years in the future such as 2090 or 3044. His parents can't keep up calculating " +
            "this so they've begged you to help them out by writing a programme that can answer Philip's endless " +
            "questions.\n Your task is to write a function that takes two parameters: the year of birth and the year to " +
            "count years in relation to. As Philip is getting more curious every day he may soon want to know how many " +
            "years it was until he would be born, so your function needs to work with both dates in the future and in the " +
            "past."),
    TASK_26(26, "Convert boolean values to strings 'Yes' or 'No'.", "Complete the method that " +
            "takes a boolean value and return a Yes string for true, or a No string for false."),
    TASK_30(30,"Thinkful - Logic Drills: Traffic light", "You're writing code to control your " +
            "town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to " +
            "green again. Complete the function that takes a string as an argument representing the current state of the " +
            "light and returns a string representing the state the light should change to."),
    TASK_34(34, "Get the mean of an array", "It's the academic year's end, fateful moment of your " +
            "school report. The averages must be calculated. All the students come to you and entreat you to calculate " +
            "their average for them. Easy ! You just need to write a script.\n" +
            "Return the average of the given array rounded down to its nearest integer."),
    TASK_38(38, "How good are you really?", "There was a test in your class and you passed it. " +
            "Congratulations!\n But you're an ambitious person. You want to know if you're better than the average " +
            "student in your class.\n You receive an array with your peers' test scores. Now calculate the average and " +
            "compare your score!\n Return True if you're better, else False!"+
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation."),
    TASK_7(7,"Beginner Series #2 Clock","Clock shows h hours, m minutes and s seconds after midnight.\n" +
            "\n"+ "Your task is to write a function which returns the time since midnight in milliseconds."),
    TASK_4(4, "Thinkful - Number Drills: Pixelart planning",
            "Your function should take two arguments: the size of the wall in millimeters and the size"
                    +"\n" +"of a pixel in millimeters. It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False. "),
    TASK_8(8, "Century From Year",
            "Given a year, return the century it is in."),
    TASK_11(11,"Grasshopper - Debug","Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius. Unfortunately his code has some bugs.\n" +
            "\n" +
            "Find the errors in the code to get the celsius converter working properly.\n" +
            "\n" +
            "To convert fahrenheit to celsius:\n" +
            "\n"+
            "Remember that typically temperatures in the current weather conditions are given in whole numbers. \n"+
            "It is possible for temperature sensors to report temperatures with a higher accuracy such as to the nearest tenth. \n"
            +"Instrument error though makes this sort of accuracy unreliable for many types of temperature measuring sensors."),
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
