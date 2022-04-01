package BasicPrograms;

/** Task 5 from BasicPrograms
 * @author RoSteik*/

public class Task5 {
    public static String greet(String name) {

        if(name == "Johnny"){
            return "Hello, my love!";
        }

        return String.format("Hello, %s!", name);

    }
}
