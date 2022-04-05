package utils;

public enum Tasks {
    TASK_1(1,"You Can't Code Under Pressure #1", "You need to double the integer and return it."),
    TASK_2(2, "Multiplying two numbers", "Implement a function which multiplies two numbers."),
    TASK_3(3, "Volume of a Cuboid",
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the " +
                    "height of the cuboid. Write a function to help Bob with this calculation."),
    TASK_4(4, "Thinkful - Number Drills: Pixelart planning",
            "Your function should take two arguments: the size of the wall in millimeters and the size"
                    +"\n" +"of a pixel in millimeters. It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False. "),
    TASK_5(5, "Jenny's secret message", "Jenny has written a function that returns a greeting for a user.\n" +
            "However, she's in love with Johnny, and would like to greet him slightly different. She added a special case to her function, but she made a mistake.\n" +
            "\n" +
            "Can you help her?"),
    TASK_6(6, "Convert to Binary", "Given a non-negative integer n, write a function to_binary/" +
            "ToBinary which returns that number in a binary format."),
    TASK_7(7,"Beginner Series #2 Clock","Clock shows h hours, m minutes and s seconds after midnight.\n" +
            "\n"+ "Your task is to write a function which returns the time since midnight in milliseconds."),
    TASK_8(8, "Century From Year",
            "Given a year, return the century it is in."),
    TASK_9(9, "Return Negative", "In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?"),
    TASK_10(10,"Age Range Compatibility Equation", "Everybody knows the classic \"half your age " +
            "plus seven\" dating rule that a lot of people follow (including myself). It's the 'recommended' age range " +
            "in which to date someone."),
    TASK_11(11,"Grasshopper - Debug","Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius. Unfortunately his code has some bugs.\n" +
            "\n" + "Find the errors in the code to get the celsius converter working properly.\n" +
            "\n" + "To convert fahrenheit to celsius:\n" +
            "\n"+ "Remember that typically temperatures in the current weather conditions are given in whole numbers. \n"+
            "It is possible for temperature sensors to report temperatures with a higher accuracy such as to the nearest tenth. \n"
            +"Instrument error though makes this sort of accuracy unreliable for many types of temperature measuring sensors."),
    TASK_12(12, "Lombok Encapsulation",
            "In Java, we have a very powerful library named Lombok. It helps to reduce the boilerplate code."
                    +"\n" +"This Kata is a challenge created for you to learn how to use lombok."),
    TASK_13(13, "FIXME: Static electrickery", "The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.\n" +
            "\n" +
            "But it's not working properly.\n" +
            "Fix the code so we can all go home early."),
    TASK_14(14, "Fractions class", "You are provided with a skeleton of the class 'Fraction', " +
            "which accepts two arguments (numerator, denominator).EXAMPLE:  Fraction fraction1 = new Fraction(4, 5);" +
            "Your task is to make this class string representable, and addable while keeping the result in the minimum " +
            "representation possible."),
    TASK_16(16, "Two fighters, one winner.",
            "Create a function that returns the name of the winner in a fight between two fighters."),
    TASK_17(17,"Building blocks","Write a class Block that creates a block (Duh..)\n" +
            "\n" +
            "The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created."),
    TASK_18(18, "Opposite number","Very simple, given an integer or a floating-point number," +
            " find its opposite."),
    TASK_19(19,"Is n divisible by x and y?","Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits."
            +"Instrument error though makes this sort of accuracy unreliable for many types of temperature measuring sensors."),
    TASK_20(20, "Convert a Boolean to a String",
            "Implement a function which convert the given boolean value into its string representation."),
    TASK_21(21,"Do I get a bonus?","Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.\n" +
            "\n" +
            "If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary."),
    TASK_22(22, "How old will I be in 2099?", "Philip's just turned four and he wants to know how " +
            "old he will be in various years in the future such as 2090 or 3044. His parents can't keep up calculating " +
            "this so they've begged you to help them out by writing a programme that can answer Philip's endless " +
            "questions.\n Your task is to write a function that takes two parameters: the year of birth and the year to " +
            "count years in relation to. As Philip is getting more curious every day he may soon want to know how many " +
            "years it was until he would be born, so your function needs to work with both dates in the future and in the " +
            "past."),
    TASK_23(23,"Rock Paper Scissors!","Let's play! You have to return which player won! In case of a draw return Draw"),
    TASK_24(24, "Basic Mathematical Operations",
            "Your task is to create a function that does four basic mathematical operations."),
    TASK_25(25,"Opposites Attract","Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. " +
            "If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.\n" +
            "\n" +
            "Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't."),
    TASK_26(26, "Convert boolean values to strings 'Yes' or 'No'.", "Complete the method that " +
            "takes a boolean value and return a Yes string for true, or a No string for false."),
    TASK_27(27,"Will there be enough space?","Bob is working as a bus driver. However, \n"+
            "he has become extremely popular amongst the city's residents. With so many passengers wanting to get \n " +
            "aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you \n"+
            "to write a simple program telling him if he will be able to fit all the passengers."),
    TASK_28(28, "The Modulo-3 Sequence",
            "Consider a sequence where the first two numbers are 0 and 1 and the next number of the "
                    +"\n" +"sequence is the sum of the previous 2 modulo 3. Write a function that finds the nth number of the sequence."),
    TASK_29(29,"Switch it Up!","When provided with a number between 0-9, return it in words."),
    TASK_30(30,"Thinkful - Logic Drills: Traffic light", "You're writing code to control your " +
            "town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to " +
            "green again. Complete the function that takes a string as an argument representing the current state of the " +
            "light and returns a string representing the state the light should change to."),
    TASK_31(31,"Transportation on vacation","After a hard quarter in the office you decide to \n"+
            "get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.\n"+
            "You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers."),
    TASK_32(32, "String repeat",
            "Write a function called repeatStr which repeats the given string string exactly n times."),
    TASK_33(33,"Cat years, Dog years","I have a cat and a dog.\n" +
            "\n" +
            "I got them at the same time as kitten/puppy. That was humanYears years ago.\n" +
            "\n" +
            "Return their respective ages now as [humanYears,catYears,dogYears]"),
    TASK_34(34, "Get the mean of an array", "It's the academic year's end, fateful moment of your " +
            "school report. The averages must be calculated. All the students come to you and entreat you to calculate " +
            "their average for them. Easy ! You just need to write a script.\n" +
            "Return the average of the given array rounded down to its nearest integer."),
    TASK_35(35,"Beginner - Lost Without a Map","Given an array of integers, return a new array with each value doubled."),
    TASK_36(36, "Counting sheep...",
            "Consider an array/list of sheep where some sheep may be missing from their place. We need a "
                    +"\n" +"function that counts the number of sheep present in the array (true means present)."),
    TASK_37(37,"Reversed sequence","Build a function that returns an array of integers from n to 1 where n>0."),
    TASK_38(38, "How good are you really?", "There was a test in your class and you passed it. " +
            "Congratulations!\n But you're an ambitious person. You want to know if you're better than the average " +
            "student in your class.\n You receive an array with your peers' test scores. Now calculate the average and " +
            "compare your score!\n Return True if you're better, else False!"+
            "Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation."),
    TASK_39(39,"Beginner - Reduce but Grow","Given a non-empty array of integers, return the result of multiplying the values together in order."),
    TASK_40(40, "Sum of positive",
            "You get an array of numbers, return the sum of all of the positives ones."),
    TASK_41(41,"My head is at the wrong end!","You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched their heads and tails around!\n" +
            "\n" +
            "Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). " +
            "It is your job to re-arrange the array so that the animal is the right way round (head, body, tail)."),
    TASK_42(42, "Twice as old","Your function takes two arguments:\n" +
            "current father's age (years)\n" + "current age of his son (years)\n" +
            "Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old)."),
    TASK_43(43,"Find Nearest square number","Your task is to find the nearest square number, nearest_sq(n), of a positive integer n."),
    TASK_44(44, "Grasshopper - Summation",
            "Write a program that finds the summation of every number from 1 to num. The number will"
                    +"\n" +" always be a positive integer greater than 0."),
    TASK_45(45, "Gap in Primes"," This function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n if these numbers exist otherwise `nil or null or None or Nothing (or ... depending on the language)."),
    TASK_46(46, "21 Sticks","Create a robot that will always win the game. Your robot will always" +
            " go first. The function should take an integer and returns 1, 2, or 3."),
    TASK_48(48, "Rotations and reflections I",
            "There are exactly eight ways to map a square onto itself by rotation or reflection. We can take its"
                    +"\n" +" mirror image (reflection in horizontal, vertical, or either of two 45-degree diagonal lines); rotate it (by 90 degrees clockwise, 90 degrees anti-clockwise, or 180 degrees); or just leave it alone."),
    TASK_49(49,"L3375p34k","The objective of this Kata is to provide some way to encode a string into its leetspeak version."),
    TASK_51(51,"onvert a Number to a String!","We need a function that can transform a number into a string."),
    TASK_52(52, "Reversed Strings",
            "Complete the solution so that it reverses the string passed into it."),
    TASK_53(53,"Welcome to the City","Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person. " +
            "Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary."),
    TASK_54(54, "Opposite number","Very simple, given an integer or a floating-point number," +
            " find its opposite."),
    TASK_56(56, "Are You Playing Banjo?",
            "Create a function which answers the question \"Are you playing banjo?\".\n" +
                    "If your name starts with the letter \"R\" or lower case \"r\", you are playing banjo!"),
    TASK_57(57,"Remove String Spaces","Simple, remove the spaces from the string, then return the resultant string."),
    TASK_58(58, "Triple Trouble", "Create a function that will return a string that combines all " +
            "of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and " +
            "grouping them next to each other. Do this for every letter, see example below!\n" +
            "E.g. Input: aa, bb , cc => Output: abcabc"),
    TASK_59(59,"Find the position!", "When provided with a letter, return its position in the alphabet."),
    TASK_60(60, "Fake Binary",
            "Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 "
                    +"\n" +"and above with '1'. Return the resulting string."),
    TASK_61(61,"Parse nice int from char problem","You ask a small girl,\"How old are you?\" She always says, \"x years old\", where x is a random number between 0 and 9.\n" +
            "\n" +
            "Write a program that returns the girl's age (0-9) as an integer."),
    TASK_63(63, "Abbreviate a Two Word Name","Write a function to convert a name into initials.\n"+
            "This kata strictly takes two words with one space in between them.\n"+
            "The output should be two capital letters with a dot separating them"),
    TASK_62(62, "Grasshopper - Debug", "Debug celsius converter\n" +
            "Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius. Unfortunately his code has some bugs.\n" +
            "Find the errors in the code to get the celsius converter working properly.\n" +
            "To convert fahrenheit to celsius:\n celsius = (fahrenheit - 32) * (5/9)"),
    TASK_64(64, "All Star Code Challenge #18",
            "Create a function that accepts 2 string arguments and returns an integer of the count of "
                    +"\n" +"occurrences the 2nd argument is found in the first one."),
    TASK_65(65,"Sort and Star","You will be given a vector of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.\n" +
            "\n" +
            "The returned value must be a string, and have \"***\" between each of its letters."),
    TASK_66(66, "Correct the mistakes of the character recognition software", "Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.\n" +
            "When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.\n" +
            "Your task is correct the errors in the digitised text. You only have to handle the following mistakes:\n" +
            "S is misinterpreted as 5\n" +
            "O is misinterpreted as 0\n" +
            "I is misinterpreted as 1\n" +
            "The test cases contain numbers only by mistake."),
    TASK_67(67,"altERnaTIng cAsE <=> ALTerNAtiNG CaSe","altERnaTIng cAsE <=> ALTerNAtiNG CaSe"),
    TASK_68(68, "Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right",
            "Remove n exclamation marks in the sentence from left to right. n is positive integer."),
    TASK_71(71,"Filtering even numbers (Bug Fixes)","The method is supposed to remove /n"+
            "even numbers from the list and return a list that contains the odd numbers."),
    TASK_69(69,"Push a hash/an object into array","You are trying to put a hash in ruby or an object in javascript or java into an array, but it always returns error, solve it and keep it as simple as possible!"),
    TASK_70(70, "Unfinished Loop - Bug Fixing #1", "Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!"),
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

    public static String getTaskNameById(int id) {
        for (Tasks task : values()) {
            if (task.id == id) {
                return task.taskName;
            }
        }
        return null;
    }

}
